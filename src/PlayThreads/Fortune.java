package PlayThreads;

public class Fortune extends Thread {

	public void run(){
		
		while(true){
			System.out.println("good things will come ur way");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // sleep for 5 sec
		}
	}
	
}
