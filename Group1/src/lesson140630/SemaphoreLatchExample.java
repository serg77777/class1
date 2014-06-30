package lesson140630;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class SemaphoreLatchExample {

	public static void main(String[] args) {
		
		System.out.println("start");
		
		final Semaphore latch = new Semaphore(0);
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					latch.acquire();
					System.out.println("running!");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		
		Scanner scanner = new Scanner(System.in);
		
		scanner.hasNextLine();
		
		latch.release();
		
	}
	
	
}
