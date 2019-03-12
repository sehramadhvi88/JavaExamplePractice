package PlayThreads;

public class FortuneCookie implements Runnable {
	
	private String first;
	private String second;
	private int sleepTime;
	
	private int count=0;
	
	public FortuneCookie(String f,String s,int st) {
		// TODO Auto-generated method stub
		this.first=f;
		this.second=s;
		this.sleepTime=st;
	}
	
	public void run(){
		
		while(true){
			
			Thread.yield(); // i (current) would like to leave running  state , that allows equal priority thread to take processor
			
			// starvation - situation where a thread never gives up
			
			System.out.print(first);
			try {				
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // sleep for specified time
			System.out.println(second); 
		}
	}
	
	public void run(String s){
		System.out.println("overloaded run method");
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getSecond() {
		return second;
	}

	public void setSecond(String second) {
		this.second = second;
	}

	public int getSleepTime() {
		return sleepTime;
	}

	public void setSleepTime(int sleepTime) {
		this.sleepTime = sleepTime;
	}
	
	public synchronized void someMethodA(){
		System.out.println("count="+0);
		System.out.println("hello method A");
		count++;
	}
	

}
