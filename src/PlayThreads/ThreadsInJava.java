package PlayThreads;

class MyThread extends Thread {
	@Override
	public void run() {
		// Task of this thread is to print multiplication of successive numbers
		// up to 1000 numbers
		for (int i = 0; i < 300; i++) {
			System.out.println(i + " * " + (i + 1) + " = " + i * (i + 1));
		}
	}
}

class MyThreadR implements Runnable {
	@Override
	public void run() {
		// Keep the task to be performed here
	}
}

public class ThreadsInJava {
	// Main Thread
	public static void main(String[] args) {

		Thread mainThread = Thread.currentThread();

		System.out.println("mainThread id=" + mainThread.getId());

		// Creating and starting MyThread.
		MyThread myThread = new MyThread();

		System.out.println("myThread.getId()=" + myThread.getId());

		myThread.setName("My Thread"); // Changing the name of the thread before
										// starting the thread

		myThread.start();

		myThread.setName("My Thread"); // changing the name of the thread when
										// thread is active

		try {
			myThread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		myThread.setName("My Thread"); // Changing the name of the thread when
										// thread is sleeping

		UserThread userThread = new UserThread();

		userThread.setDaemon(true); // Changing the thread as Daemon

		userThread.start();

		userThread.setDaemon(true); // after starting thread cant set daemon
									// thread , throw
									// IllegalThreadStateException

		System.out.println("userThread.isDaemon()=" + userThread.isDaemon());

		DaemonThread daemon = new DaemonThread(); // Creating the DaemonThread

		daemon.start(); // Starting the daemon thread
	}
}

class UserThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.println("This is an user thread...." + i);
		}
	}
}

class DaemonThread extends Thread {
	public DaemonThread() {
		setDaemon(true);
	}

	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			System.out.println("This is daemon thread....." + i);
		}
	}
}

// Usage Class
class UsageClassOne {
	void method() {
		// Using the thread and it's task

		MyThread t = new MyThread();
		t.start();
	}
}

// Usage Class
class UsageClassTwo {
	void method() {
		// Using the thread and it's task

		MyThread t = new MyThread();
		t.start();
	}
}
