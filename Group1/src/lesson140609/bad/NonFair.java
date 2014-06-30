package lesson140609.bad;

import lesson140528.Utils;

public class NonFair {
	
	
	
	public static void main(String[] args) {
		
		System.out.println("start");
		
		final Object mutex = new Object();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				synchronized (mutex) {
					Utils.pause(3000);
				}
			}
		}).start();
		
		class Task implements Runnable {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " started");
				synchronized (mutex) {
					System.out.println(Thread.currentThread().getName());
				}
			}
		}
		
		new Thread(new Task(), "t1").start();
		Utils.pause(100);
		new Thread(new Task(), "t2").start();
		Utils.pause(100);
		new Thread(new Task(), "t3").start();
		Utils.pause(100);
		new Thread(new Task(), "t4").start();
		Utils.pause(100);
		new Thread(new Task(), "t5").start();
		
	}

}
