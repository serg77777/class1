package lesson140618;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import lesson140528.Utils;

public class FutureExample {

	public static void main(String[] args) {
		
		ExecutorService service = Executors.newCachedThreadPool();
		
		Future<String> future = service.submit(new Callable<String>() {
			@Override
			public String call() throws Exception {
				Utils.pause(2000);
				return "hello";
			}
		});
		
		System.out.println("waiting for result...");
		
		try {
			String result = future.get();
			System.out.println(result);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		
		service.shutdown();
		
	}
	
}
