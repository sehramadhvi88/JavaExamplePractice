package playCollections;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueDemo {

	public static void main(String[] args) throws InterruptedException {
		
		BlockingQueue<String> bQueue=new ArrayBlockingQueue<>(10);
		
		//bQueue.put(null); //Unhandled exception type InterruptedException
		
		BlockingQueue<String> bQueue1 = new ArrayBlockingQueue<String>(2);
		BlockingQueue<String> bQueue2 = new ArrayBlockingQueue<String>(2);
		
		bQueue2.put("Java"); //insert object into BlockingQueue
		System.out.println("BlockingQueue after put: " + bQueue2);
		bQueue2.take(); //retrieve object from BlockingQueue in Java
		System.out.println("BlockingQueue after take: " + bQueue2);
		
		bQueue1.put("Java");
		System.out.println("Item 1 inserted into BlockingQueue");
		bQueue1.put("JDK");
		System.out.println("Item 2 is inserted on BlockingQueue");
		bQueue1.put("J2SE");
		System.out.println("Done");

		
		

		
		
	}
	
}
