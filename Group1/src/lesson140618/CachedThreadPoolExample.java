package lesson140618;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import lesson140528.Utils;

public class CachedThreadPoolExample {

	public static void main(String[] args) {
		
		final ThreadPoolExecutor pool = (ThreadPoolExecutor) Executors.newCachedThreadPool();
		
		class Task implements Runnable {
			@Override
			public void run() {
				Utils.pause(1000);
			}
		}
		
		pool.submit(new Runnable() {
			
			@Override
			public void run() {
				while (true) {
					System.out.println("active thread count " + pool.getActiveCount());
					System.out.println("current pool size " + pool.getPoolSize());
					Utils.pause(1000);
				}
			}
		});
		
		
		for (int i = 0; i < 20; i++) {
			pool.submit(new Task());
			Utils.pause(1000);
		}
		
	}
	
}
