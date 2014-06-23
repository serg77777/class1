package lesson140618;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {

	public static void main(String[] args) {
		
		System.out.println("start");
		
		final CountDownLatch latch = new CountDownLatch(1);
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					latch.await();
					System.out.println("running!");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		
		Scanner scanner = new Scanner(System.in);
		
		scanner.hasNextLine();
		
		latch.countDown();
		
	}
	
	
}
