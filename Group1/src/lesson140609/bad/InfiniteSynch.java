package lesson140609.bad;

import lesson140528.Utils;

public class InfiniteSynch {

	public static void main(String[] args) {
		
		final Object mutex = new Object();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("start infinite loop");
				synchronized (mutex) {
					while (true) {
					}
				}
				
			}
		}).start();
		
		Utils.pause(1000);
		
		Thread starvationThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				synchronized (mutex) {
					System.out.println("hello!");
				}
			}
		});
		starvationThread.setDaemon(true);
		starvationThread.start();
		
		starvationThread.interrupt();
		starvationThread.suspend();
		starvationThread.resume();
		starvationThread.stop();
		
	}
	
}
