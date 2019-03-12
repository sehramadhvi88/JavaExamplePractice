package PlayThreads;

import java.util.Scanner;

public class FirstThread {
	
	public static void main(String ar[]){
		Scanner input= new Scanner(System.in);
		
		/*FortuneCookie fc1=new FortuneCookie("you will always", "  travel to different places", 1000);
		FortuneCookie fc2=new FortuneCookie("never expect", "  lots of money", 1200);
		*/
			
		Thread t1=new Thread(new FortuneCookie("you will always", "  travel to different places", 1000));
		Thread t2=new Thread(new FortuneCookie("never expect", "  lots of money", 1200));
		

		printStateAndIsAlive(t1);
		printStateAndIsAlive(t2);
		
		t1.start();
		t2.start();
		
		
		
		//t1.run("hii");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		printStateAndIsAlive(t1);
		printStateAndIsAlive(t2);
		
		try {
			t2.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		printStateAndIsAlive(t1);
		printStateAndIsAlive(t2);
		
		
		//fc1.start();
		//fc2.start();
		
		Fortune myFortuneThread=new Fortune();		// born
		
		//myFortuneThread.setDaemon(true); // when main thread dies the thread that we spun also dies 
		// myFortuneThread is a user thread - user thread does not depend upon parent thread
		//myFortuneThread.start(); // ready state
		// myFortuneThread.run(); - calling run method directly , then thread wud be a normal method
		
		System.out.println("enter anything");
		
		input.next();
		
		System.out.println("input entered");
		
		try {
			Thread.sleep(3000); // sleep for 3 sec
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		printStateAndIsAlive(t1);
		printStateAndIsAlive(t2);
		
		System.out.println("I slept for 3 sec");
	}

	private static void printStateAndIsAlive(Thread t1) {
		// TODO Auto-generated method stub
		System.err.println("thread state="+t1.getState());
		System.out.println("is thread alive="+t1.isAlive());
	}
	
	

}
