package lesson140630;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class MyLatchExample {

	private static final class Task implements Runnable {
		private final MyLatch _latch;

		private Task(MyLatch latch) {
			_latch = latch;
		}

		@Override
		public void run() {
			try {
				_latch.await();
				System.out.println("running!");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		System.out.println("start");
		
		final MyLatch latch = new MyLatch(1);
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				synchronized (latch) {
					while (true) {}
				}
			}
		}).start();
		
		new Thread(new Task(latch)).start();
		new Thread(new Task(latch)).start();
		new Thread(new Task(latch)).start();
		
		Scanner scanner = new Scanner(System.in);
		
		scanner.hasNextLine();
		
		latch.countdown();
		
	}
	
	
}
