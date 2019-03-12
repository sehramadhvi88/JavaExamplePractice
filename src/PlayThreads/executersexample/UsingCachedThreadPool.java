package PlayThreads.executersexample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingCachedThreadPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main thread started here");
		
		
		ExecutorService service=Executors.newCachedThreadPool(); // starts all threads at once 
		
		service.execute(new LoopTaskA());
		service.execute(new LoopTaskA());
		service.execute(new LoopTaskA());
		service.execute(new LoopTaskA());
		service.execute(new LoopTaskA());
		service.execute(new LoopTaskA());
		
		service.shutdown();
		
		//service.execute(new LoopTaskA()); 
		// no task would be accepted after shutdown , it throw rejected exception
		
		System.out.println("main thread ends here");
		
	}

}


