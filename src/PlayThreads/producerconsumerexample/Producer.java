package PlayThreads.producerconsumerexample;

public class Producer extends Thread {

	private Cup cup;
	private int number;
	
	public Producer(Cup cup, int number) {
		// TODO Auto-generated constructor stub
		this.cup=cup;
		this.number=number;
	}
	
	public void run(){
		
		int value=0;
		
		for(int i=0;i<10;i++){
			
			cup.put(i);
			System.out.println("producer #"+ this.number + " put :"+ i);
			
			try {
				sleep((long)(100*Math.random()));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}

} 
