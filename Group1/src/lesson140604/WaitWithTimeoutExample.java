package lesson140604;

import lesson140528.Utils;

public class WaitWithTimeoutExample {

	public static void main(String[] args) {

		System.out.println("start");

		final Object mutex = new Object();

		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (mutex) {
					try {
						System.out.println("before wait");
						mutex.wait(10000);
						System.out.println("awaken");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});

		thread.start();

		Utils.pause(5000);

		System.out.println("trying to lock mutex");
		synchronized (mutex) {
			System.out.println("locked mutex");
			Utils.pause(6000);
			System.out.println("unlocked mutex");
		}

		System.out.println("finished");

	}

}
