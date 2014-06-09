package lesson140609;

import lesson140528.Utils;


public class WorkerBlockingExample {

	static class Task implements Runnable {
		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName() + " started task");
			Utils.pause(3000);
			System.out.println(Thread.currentThread().getName() + " finished task");
			throw new RuntimeException();
		}
	}
	
	public static void main(String[] args) {
		
		WorkerWithBlockingQueue worker = new WorkerWithBlockingQueue();
		
		worker.execute(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread() + " says hello!");
			}
		});
		
		worker.execute(new Task());
		worker.execute(new Task());
		worker.execute(new Task());
		
		worker.shutdown();
		
	}
	
	
}
