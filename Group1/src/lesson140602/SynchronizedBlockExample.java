package lesson140602;

public class SynchronizedBlockExample {

	static class Counter {
		int counter;
		
		public void inc() {
			synchronized (this) {  // this <=> mutex
				// mutual exclusion
				counter++;
			}
			// something else  
		}
		
		public int getCounter() {
			synchronized (this) {
				return counter;
			}
		}

		synchronized public int getCounter2() {
				return counter;
		}
	}
	
	
}
