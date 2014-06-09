package lesson140604;

import lesson140528.Utils;

public class DeadLock {

	
	public static void main(String[] args) {

		
		
		
		class Task implements Runnable {
			
			private Object _mutex1;
			private Object _mutex2;

			public Task(Object mutex1, Object mutex2) {
				_mutex1 = mutex1;
				_mutex2 = mutex2;
			}
			
			@Override
			public void run() {
				synchronized (_mutex1) {
					System.out.println("locked m1 " + _mutex1);
					Utils.pause(1000);
					synchronized (_mutex2) {
						System.out.println("locked m2 " + _mutex2);
						System.out.println("processing m1 " + _mutex1);
						Utils.pause(5000);
						System.out.println("processing m2 " + _mutex2);
						Utils.pause(5000);
						System.out.println("finished");
					}
				}
			}
		}

		final Object a = new Object();
		final Object b = new Object();
		new Thread(new Task(a, b)).start();
		new Thread(new Task(a, b)).start();
		
		
	}
	
}
