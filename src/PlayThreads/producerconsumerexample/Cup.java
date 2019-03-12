package PlayThreads.producerconsumerexample;

public class Cup {
	
	private int coffee;
 
	public Cup(int coffee) {
		// TODO Auto-generated constructor stub
		this.coffee=coffee;
	}	 

	public Cup() {
		// TODO Auto-generated constructor stub
	}

	synchronized public int getCoffee() {
		return coffee;
	}

	synchronized public void setCoffee(int coffee) {
		this.coffee = coffee;
	}

	// synchronized
	synchronized public void drink() { 
		// TODO Auto-generated method stub
		
		int localCoffee=coffee;
		
		localCoffee--;
		System.out.println(" sip ");
		
		try {
			Thread.sleep((long)(100*Math.random()));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		coffee=localCoffee;
		
	}

	synchronized public void pour() {
		// TODO Auto-generated method stub
		
		int localCoffee=coffee;
		
		localCoffee++;
		System.out.println(" pour ");
		
		try {
			Thread.sleep((long)(100*Math.random()));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		coffee=localCoffee;
		 
	}
	
	private int content;
	private boolean available=false;
 
	synchronized public int get() {
		// TODO Auto-generated method stub
		while(!available){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		available=false;
		notifyAll();
		return content;
	}

	synchronized public void put(int value) {
		// TODO Auto-generated method stub
		while(available){
			try{
				wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
		available=true;
		content=value;
		notifyAll();
	}
 
} 
