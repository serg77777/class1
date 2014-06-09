package lesson140604;

import lesson140528.Utils;

public class InterruptExample {

	public static void main(String[] args) {
		
		System.out.println("start");
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Utils.pause(10000);
			}
		});
		t1.start();

		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				long c = 0;
				int interruptions = 0;
				while(interruptions < 2) {
					c++;
					if (Thread.interrupted()) {
						System.out.println("got interruption signal");
						interruptions++;
					}
				}
				System.out.println("c = " + c );
			}
		});
		t2.start();
		
		Utils.pause(3000);
		
		t1.interrupt();
		t2.interrupt();
		Utils.pause(3000);
		
		t2.interrupt();
		
		Utils.pause(100);
		System.out.println(t1.getState());
		System.out.println(t2.getState());
		
	}
	
}
