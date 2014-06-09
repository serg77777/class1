package lesson140604;

import lesson140528.Utils;

public class MutexBlock {

	Object mutex = new Object();
	
	void a() {
		synchronized (mutex) {
			System.out.println("executing method a()");
			Utils.pause(5000);
			System.out.println("finished method a()");
		}
	}
	
	void b() {
		synchronized (mutex) {
			System.out.println("executing method b()");
			Utils.pause(5000);
			System.out.println("finished method b()");
		}
	}
	
	public static void main(String[] args) {
		
		final MutexBlock mutex = new MutexBlock();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				mutex.a();
			}
		}).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				mutex.b();
			}
		}).start();
		
	}
	
	
}
