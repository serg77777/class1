package lesson140630;

import java.util.concurrent.Semaphore;

public class SemaphoreExamples {

	static class Counter  {

		final Semaphore sem = new Semaphore(1);
		volatile int count = 0;
		
		public void inc() {
			try {
				sem.acquire();
				try {
					count++;
				} finally {
					sem.release();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		public int get() {
			return count;
		}
		
	}
	
	
}
