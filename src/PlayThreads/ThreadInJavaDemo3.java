package PlayThreads;

public class ThreadInJavaDemo3 {

	public static void main(String[] args) {
		final Shared s1 = new Shared();
		final Shared s2 = new Shared();

		Thread t1 = new Thread("thread 1") {
			@Override
			public void run() {
				s1.SharedMethod2();
				//Shared.staticMethod();
			}
		};

		Thread t2 = new Thread("thread 2") {
			@Override
			public void run() {
				//s2.SharedMethod2();
				Shared.staticMethod();
			}
		};

		t1.start();

		t2.start();
	}

}

class Shared {
	int i;
	int j;

	/*
	 * synchronized public Shared() { //compile time error, constructors can not
	 * be synchronized }
	 * 
	 * synchronized static { //Compile time error, Static initializer can not be
	 * synchronized }
	 * 
	 * synchronized { //Compile time error, Instance initializer can not be
	 * synchronized }
	 */
	void SharedMethod() {
		i = 10;
		System.out.println(i);
		i = 20;
		System.out.println(i);
		i = 30;
		System.out.println(i);
	}

	synchronized void SharedMethod2() {
		Thread t = Thread.currentThread();

		for (j = 0; j <= 1000; j++) {
			System.out.println(t.getName() + " : " + j);
		}
	}

	static void staticMethod() {
		synchronized (Shared.class) {
			// static synchronized block
			for (int j = 0; j <= 3; j++) {
				System.out.println(Thread.currentThread().getName() + " : " + j +" shared method");
			}
		}
	}

	void NonStaticMethod() {
		synchronized (this) {
			// Non-static synchronized block
		}
	}

	void anotherNonStaticMethod() {
		synchronized (new Shared()) {
			// Non-static synchronized block
		}
	}

}