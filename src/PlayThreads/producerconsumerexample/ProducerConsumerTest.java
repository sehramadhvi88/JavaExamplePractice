package PlayThreads.producerconsumerexample;

public class ProducerConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cup cup=new Cup();

		Producer p1=new Producer(cup,1);
		Consumer c1=new Consumer(cup,1);
		//Consumer c2=new Consumer(cup,2);
		
		p1.start();
		c1.start();
		//c2.start();
		
	}

}
