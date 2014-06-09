package lesson140602;

import java.util.Random;

import lesson140528.Utils;

public class CriticalSectionExample {

	static class Counter {
		int counter;

		synchronized public int getCounter() {  // to solve visibility problem
			return counter;
		}

		synchronized public void inc() {
			int tmp = counter;
			tmp = tmp + 1;
			counter = tmp;
			System.out.println(Thread.currentThread().getName()
					+ " counter = " + counter);
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
