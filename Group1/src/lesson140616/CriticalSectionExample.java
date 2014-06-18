package lesson140616;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import lesson140528.Utils;

public class CriticalSectionExample {

	static class Counter {
		
		private Lock lock = new ReentrantLock();
		
		private int count;

		public int getCounter() {  
			lock.lock();
			try {
				return count;
			} finally {
				lock.unlock();
			}
		}

		public void inc() {
			lock.lock();
			try {
				int tmp = count;
				tmp = tmp + 1;
				count = tmp;
				System.out.println(Thread.currentThread().getName()
						+ " counter = " + count);
			} finally {
				lock.unlock();
			}
		}
	}
	
	static Counter counter = new Counter();
	
	
	static class Turniket implements Runnable {

		@Override
		public void run() {
			Random random = new Random();
			while (true) {
//				Utils.pause(random.nextInt(2000) + 1000);
				Utils.pause(2000);  //  Race Condition
				counter.inc();
//				System.out.println(Thread.currentThread().getName()
//						+ " counter = " + counter);
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 8; i++) {
			new Thread(new Turniket()).start();
		}
		
	}
	
	
}
