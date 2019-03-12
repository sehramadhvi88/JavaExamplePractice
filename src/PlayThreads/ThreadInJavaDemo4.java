package PlayThreads;

public class ThreadInJavaDemo4 {

	public static void main(String[] args) {
		final SharedClass s1 = new SharedClass();
		// final Shared s2 = new Shared();

		Thread t1 = new Thread("thread 1") {
			@Override
			public void run() {
				s1.methodOne();
			}
		};

		Thread t2 = new Thread("thread 2") {
			@Override
			public void run() {
				s1.methodTwo();
			}
		};

		t1.start();

		t2.start();

		Thread t = new Thread() {
			public void run() {
				for (int i = 0; i <= 1000; i++) {
					System.out.println("jjjjh=" + i);
				}
				try {
					Thread.sleep(10000); // Thread is sleeping for 10 seconds
				} catch (InterruptedException e) {
					System.out.println("Thread is interrupted");
				}
			}
		};

		t.start();

		try {
			System.out.println("sleeping main");
			Thread.sleep(3000); // Main thread is sleeping for 3 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		t.interrupt(); // main thread is interrupting thread t

	}

}

class SharedClass {
	synchronized void methodOne() {
		Thread t = Thread.currentThread();

		System.out.println(t.getName() + " is relasing the lock and going to wait");

		try {
			wait(); // releases the lock of this object and waits
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(t.getName() + " got the object lock back and can continue with it's execution");
	}

	synchronized void methodTwo() {
		Thread t = Thread.currentThread();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		notify(); // wakes up one thread randomly which is waiting for lock of
					// this object

		System.out.println("A thread which is waiting for lock of this object is notified by " + t.getName());
	}
}
