package lesson140630.atomics;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVsSync {

	static class Counter {
		volatile int count;
		public int get() {
			return count;
		}
		public synchronized int inc() {
			return ++count;
		}
	}
	
	public static void main(String[] args) {
		
		final Counter c1 = new Counter();
		
		final AtomicInteger c2 = new AtomicInteger();
	
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				long start = System.currentTimeMillis();
				for (int i = 0; i < 100000000; i++) {
					c1.inc();
				}
				long stop = System.currentTimeMillis();
				System.out.println("elapsed " + (stop - start));
			}
		});
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				long start = System.currentTimeMillis();
				for (int i = 0; i < 100000000; i++) {
					c2.incrementAndGet();
				}
				long stop = System.currentTimeMillis();
				System.out.println("elapsed " + (stop - start));
			}
		}).start();
		
	}
	
}
