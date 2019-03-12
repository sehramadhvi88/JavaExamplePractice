package PlayThreads.producerconsumerexample;

public class Waiter extends Thread {

	private Cup cup;
	
	public Waiter(Cup cup) { 
		// TODO Auto-generated constructor stub
		this.cup=cup;
	}
	
	public void setCup(Cup cup){
		this.cup=cup;
	}
	
	public Cup getCup(){
		return cup;
	}

	public void run(){
		

		for(int i=1;i<=10;i++){
			cup.pour();
		}
	}
	
}
