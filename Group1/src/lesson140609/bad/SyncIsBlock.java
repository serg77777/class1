package lesson140609.bad;

import java.util.LinkedList;
import java.util.List;

public class SyncIsBlock {
	
	final static Object mutex = new Object();
	
	static List<String> data = new LinkedList<>();
	
	public static void startCriticalSection() {
		synchronized (mutex) {
			for (String item : data) {
				System.out.println(item);
			}
		}
	}

	public static void finishCriticalSection() {
		
	}

}
