package lesson140609;

import lesson140528.Utils;


public class NotifyAllExample {
	
	static final Object mutex = new Object();

	static class Task implements Runnable {

		@Override
		public void run() {
			synchronized (mutex) {
				try {
					mutex.wait();
					System.out.println(Thread.currentThread().getName());
					Utils.pause(3000);
					System.out.println(Thread.currentThread().getName() + " finished");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	 
	
	public static void main(String[] args) {
		
		System.out.println("start");
		
		Task task = new Task();
		new Thread(task).start();
		new Thread(task).start();
		new Thread(task).start();

//		Utils.pause(1000);
		synchronized (mutex) {
//			Utils.pause(1000);
			mutex.notifyAll();
//			Utils.pause(1000);
		}
	}
	
}
