package PlayThreads.executersexample;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class CallableExample {

	public static void main(String[] args) {

		ThreadPoolExecutor executer = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

		List<Future<Integer>> resultList = new ArrayList<>();

		Random random = new Random();

		for (int i = 0; i < 4; i++) {

			Integer number = random.nextInt(10);
			System.out.println("number ="+number); 
			FactorialCalculator fac = new FactorialCalculator(number);
			Future<Integer> result = executer.submit(fac);
			resultList.add(result);
		}

		for (Future<Integer> future : resultList) {
			try {
				System.out.println(
						"Future result is - " + " - " + future.get() + "; And Task done is " + future.isDone());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
		// shut down the executor service now
		executer.shutdown();

	}

}
