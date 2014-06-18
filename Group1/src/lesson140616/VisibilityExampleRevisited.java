package lesson140616;

import lesson140528.Utils;

public class VisibilityExampleRevisited {

	static class Task implements Runnable {

		volatile long stop;
		
		@Override
		public void run() {  // called by Thread-0
			long count = 0;
			while(notStopped()) {
				count++;
			}
			System.out.println("stopped, count = " + count);
		}

		private boolean notStopped() {
			return stop != Long.MAX_VALUE;
		}
		
		public void stop(long stopValue) {  // called by main
			stop = stopValue;
		}
		
	}
	
	public static void main(String[] args) {
		Task task = new Task();
		new Thread(task).start();
		
		Utils.pause(10000);
		
		task.stop(Long.MAX_VALUE);
		
	}
	
	
}
