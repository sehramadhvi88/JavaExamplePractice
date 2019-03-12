package PlayThreads;

public class Example {

	private static class MyDaemonThread extends Thread {

		public MyDaemonThread() {
			setDaemon(true);
		}

		@Override
		public void run() {
			while (true) {
				try {
					System.out.println("in while");  
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread thread = new MyDaemonThread();
		System.out.println("start new thread");
		thread.start();
		System.out.println("main end");
	}
}