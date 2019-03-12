package PlayThreads;

public class MyThreadDemo extends Thread {

	public MyThreadDemo(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println("Executing thread "+Thread.currentThread().getName());
	}

	public static void main(String[] args) throws InterruptedException {
		MyThreadDemo myThread = new MyThreadDemo("myThread");
		myThread.start();
	}
}