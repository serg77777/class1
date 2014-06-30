package lesson140630.atomics;

import java.util.concurrent.atomic.AtomicInteger;

import lesson140528.Utils;

public class AtomicExample {

	public static void main(String[] args) {
		
		final AtomicInteger counter = new AtomicInteger();
		
		class Task implements Runnable {

			@Override
			public void run() {
				while (true) {
					int count = counter.incrementAndGet();
					System.out.println(Thread.currentThread().getName() + " count = " + count);
					Utils.pause(1000);
				}
			}
			
		}
		
		new Thread(new Task()).start();
		new Thread(new Task()).start();
		new Thread(new Task()).start();
		
		
	}
	
	
}
