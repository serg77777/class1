package lesson140602;

import lesson140528.Utils;

public class VisibilityExample {

	static class Task implements Runnable {

		boolean stop;
		
		@Override
		public void run() {  // called by Thread-0
			while(!stop) {
				System.out.println("working...");
				Utils.pause(1000);
			}
			System.out.println("stopping..");
		}
		
		public void stop() {  // called by main
			stop = true;
		}
		
	}
	
	public static void main(String[] args) {
		Task task = new Task();
		new Thread(task).start();
		
		Utils.pause(10000);
		
		task.stop();
		
	}
	
	
}
