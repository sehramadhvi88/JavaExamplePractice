package PlayThreads.producerconsumerexample;

public class Consumer extends Thread{

	private Cup cup;
	private int number;
	
	public Consumer(Cup cup, int number) {
		// TODO Auto-generated constructor stub
		this.cup=cup;
		this.number=number;
	}
	
	public void run(){
		
		int value=0;
		
		for(int i=0;i<10;i++){
		
			try {
				sleep((long)(200*Math.random()));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			value=cup.get();
			
			System.out.println("consumer #"+ this.number + " get :"+ value);
			
		}
		
	}

}
 