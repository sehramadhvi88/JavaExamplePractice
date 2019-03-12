package PlayThreads;

public class SecondThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		new Thread(new Runnable(){
			
			@Override
			public void run(){
				System.out.println("run method");
			}
			
		}).start();
			
	}

}
