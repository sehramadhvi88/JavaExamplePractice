package PlayThreads.executersexample;

import java.util.concurrent.TimeUnit;

public class LoopTaskA implements Runnable {

	private static int count=0;
	private int id;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("===<task-"+id+"> starting===");
		
		for(int i=10;i>0;i--){
			System.out.println("<task-"+id+"> tick tick"+i);
			
			try {
				TimeUnit.MILLISECONDS.sleep((long)Math.random()*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println("===<task-"+id+"> end===");
	}
	
	public LoopTaskA(){
		this.id=++count;
	}

}
