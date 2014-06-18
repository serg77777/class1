package lesson140616;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExamples {

	final static Lock lock = new ReentrantLock();
	
	public static void main(String[] args) {
		
		lock.lock();
		try {
			System.out.println("hello there!");
		} finally {
			lock.unlock();
		}
		
		
	}
	
}
