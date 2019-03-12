package PlayThreads.producerconsumerexample;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cup cup=new Cup(0); //sharing data is cup btw waiter and customer

		Waiter bob=new Waiter(cup);
		Customer steve=new Customer(cup);
		
		bob.start();
		steve.start();
		
		// once a thread enters into synchronized prevents all thread from executing on same object
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(cup.getCoffee());
		
	}

}
