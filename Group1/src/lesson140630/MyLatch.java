package lesson140630;

import java.util.concurrent.Semaphore;

public class MyLatch {

	private final Object mutex = new Object();
	private final Semaphore sem;

	public MyLatch(int countdown) {
		sem = new Semaphore(0);
	}
	
	public void await() throws InterruptedException {
		sem.acquire();
	}
	
	public void countdown() {
		synchronized (mutex) {
			int threadCount = sem.getQueueLength();
			sem.release(threadCount);
		}
	}

}
