package PlayThreads;

import java.util.Scanner;

public class UsingVolatileKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Processor p1=new Processor();
		Processor p2=new Processor();
		p1.setName("thread p1");
		p2.setName("thread p2");
				p1.start(); // new thread spun
				p2.start();
		
	   System.out.println("press enter");
	   Scanner input=new Scanner(System.in);		
	   input.nextLine();
				
		p1.running = false;
		
		System.out.println("press enter");
		   Scanner input1=new Scanner(System.in);		
		   input1.nextLine();
		p2.running = false;
		/*
		 *  calling shut down on main thread
		 *  and setting running value
		 */
		System.out.println("main end , keepRunning set to false.");
	}
}




class Processor extends Thread{
	
	volatile boolean running=true; // prevent thread from caching variables in absence of synchronization
	
	public void run(){
		long count=0;
		
		while(running){
			System.out.println(this.getName()+" hello");
			count++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println(this.getName()+ " thread end"+count);
	}
	
	
	
}