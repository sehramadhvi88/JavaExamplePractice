package PlayThreads;

public class MyThreads {

	private static class MyDaemonThread extends Thread {

		public MyDaemonThread(String name) {
			setDaemon(true);
			setName(name); 
		}

		@Override
		public void run() {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}		
	}

	public static void main(String[] args) throws InterruptedException {
		Thread thread = new MyDaemonThread("custome thread");
		thread.start();
		thread.join();
		System.out.println(thread.isAlive() + " "+thread.getName());
		
		Runtime.getRuntime().addShutdownHook(new Thread(){
			
			@Override
			public void run(){
				
				System.out.println(" Running shutdown hook " + Thread.currentThread().getName());   
			}
			
		});
		
	}
}