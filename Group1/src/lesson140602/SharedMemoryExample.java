package lesson140602;

import lesson140528.Utils;

public class SharedMemoryExample {

	static String message;
	
	static class Task implements Runnable {
		
		private String _name;
		private long _pauseMillis;

		public Task(String name, long pauseMillis) {
			_name = name;
			_pauseMillis = pauseMillis;
		}
		
		@Override
		public void run() {
			Thread.currentThread().setName(_name);
			while (true) {
				message = _name;
				Utils.pause(_pauseMillis);
			}
		}
	}
	
	public static void main(String[] args) {
		
		new Thread(new Task("First", 2000)).start();
		new Thread(new Task("Second", 2500)).start();
		new Thread(new Task("Third", 2800)).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while (true) {
					System.out.println(message);
					Utils.pause(1000);
				}
			}
		}).start();
		
	}
	
}
