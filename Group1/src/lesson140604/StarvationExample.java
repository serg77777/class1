package lesson140604;

import lesson140528.Utils;

public class StarvationExample {

	public static void main(String[] args) {

		System.out.println("start");

		final Object mutex = new Object();

		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (mutex) {
					Utils.pause(20000000);
				}
			}
		});

		thread.start();

		Utils.pause(5000);

		System.out.println("trying to lock mutex");
		synchronized (mutex) {
			System.out.println("locked mutex");
		}

		System.out.println("finished");

	}

}
