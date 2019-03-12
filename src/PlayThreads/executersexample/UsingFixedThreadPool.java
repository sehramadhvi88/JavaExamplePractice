package PlayThreads.executersexample;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class UsingFixedThreadPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main thread started here");
		
		
		ExecutorService service=Executors.newFixedThreadPool(3);
		
		service.execute(new LoopTaskA());
		service.execute(new LoopTaskA());
		service.execute(new LoopTaskA());
		service.execute(new LoopTaskA());
		service.execute(new LoopTaskA());
		service.execute(new LoopTaskA());
		
			
		Future<String> future=(Future<String>) service.submit(new LoopTaskA());
		
		try {
			String result = future.get();
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		service.shutdown();
		
		service.execute(new LoopTaskA()); // no task would be accepted after shutdown
		
		System.out.println("main thread ends here");
		
	}

}


