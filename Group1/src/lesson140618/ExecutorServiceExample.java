package lesson140618;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import lesson140528.Utils;

public class ExecutorServiceExample {

	static class Task implements Runnable {
		@Override
		public void run() {
			System.out.println(Thread.currentThread());
			Utils.pause(1000);
			System.out.println("finished");
		}
		
	}
	
	public static void main(String[] args) {
		
		ExecutorService service = Executors.newSingleThreadExecutor();
		
		for (int i = 0; i < 10; i++) {
			service.execute(new Task());
		}
		
	}
	
	
}
