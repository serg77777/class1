package lesson140528;

public class ThreadCreation {

	static class MyTask extends Thread {
		
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				Utils.pause(1000);
				System.out.println(Thread.currentThread().getName() + ": i = " + i);
			}
		}
		
	}
	
	static class MyTask2 implements Runnable {

		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				Utils.pause(1000);
				System.out.println(Thread.currentThread().getName() + ": i = " + i);
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		new MyTask().start();
		new Thread(new MyTask2()).start();
		
		System.out.println(Thread.activeCount());
		Thread.dumpStack();
		
	}
	
}
