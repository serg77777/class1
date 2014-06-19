package lesson140618;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import lesson140528.Utils;

public class CompletionServiceExample {

	static class Task implements Callable<String> {
		private int _number;
		private long _millis;

		public Task(int number, long millis) {
			_number = number;
			_millis = millis;
		}

		@Override
		public String call() throws Exception {
			Utils.pause(_millis);
			return Integer.toString(_number);
		}
	}

	public static void main(String[] args) {

		ExecutorService service = Executors.newCachedThreadPool();
		CompletionService<String> completionService = new ExecutorCompletionService<>(
				service);

		Random random = new Random();

		for (int i = 0; i < 10; i++) {
			completionService.submit(new Task(i, random.nextInt(5000) + 2000));
		}

		Future<String> future;
		try {
			for (int i = 0; i < 10; i++) {
				future = completionService.take();
				try {
					String result = future.get();
					System.out.println(result);
				} catch (ExecutionException e) {
					e.printStackTrace();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		service.shutdown();

	}

}
