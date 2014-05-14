package lesson140226;

import java.util.concurrent.TimeUnit;

public class ObjectLifeCycle {

	public static void main(String[] args) throws InterruptedException {
		
		E e = new E(10);
		
		new E();
		new E();
		new E();
		new E();
		
		System.gc();   //  Garbage Collection
		
		TimeUnit.SECONDS.sleep(10);
		
	}
	
}
