package lesson140630;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import lesson140528.Utils;

public class FairLockExample {
	static class Task implements Runnable {
		private Lock _mutex;
		public Task(Lock mutex) {
			_mutex = mutex;
		}
		
		@Override
		public void run() {
			System.out.println(
					Thread.currentThread().getName() + " started");
			_mutex.lock();
			try {
				System.out.println(
						Thread.currentThread().getName());
			} finally {
				_mutex.unlock();
			}
		}
	}
	
	public static void main(String[] args) {
		final Lock mutex = new ReentrantLock();
		new Thread(new Runnable() {
			@Override
			public void run() {
				mutex.lock();
				try {
					Utils.pause(15000);
				} finally {
					mutex.unlock();
				}
			}
		}).start();
		
		Utils.pause(100);
		for (int i = 0; i < 100; i++) {
			new Thread(new Task(mutex)).start();
			Utils.pause(100);
		}
	}
	
}
