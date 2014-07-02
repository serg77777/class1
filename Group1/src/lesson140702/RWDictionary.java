package lesson140702;

import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import lesson140528.Utils;

class RWDictionary {
	private final Map<String, String> m = new TreeMap<String, String>();
	private final ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
	private final Lock r = rwl.readLock();
	private final Lock w = rwl.writeLock();

	public String get(String key) {
		System.out.println(Thread.currentThread().getName() + " is trying to read");
		r.lock();
		try {
			System.out.println(Thread.currentThread().getName() + " has started reading");
			Utils.pause(2000);
			return m.get(key);
		} finally {
			System.out.println(Thread.currentThread().getName() + " finished");
			r.unlock();
		}
	}

	public String put(String key, String value) {
		System.out.println(Thread.currentThread().getName() + " ---< is trying to write >---");
		w.lock();
		try {
			System.out.println(Thread.currentThread().getName() + " ---< has started writing >---");
			Utils.pause(5000);
			return m.put(key, value);
		} finally {
			System.out.println(Thread.currentThread().getName() + " ---< finished >---");
			w.unlock();
		}
	}

	static class Reader implements Runnable {

		private RWDictionary _dictionary;

		public Reader(RWDictionary dictionary) {
			_dictionary = dictionary;
		}

		@Override
		public void run() {
			while (true) {
				_dictionary.get("Pete");
				Utils.pause(100);
			}
		}

	}

	static class Writer implements Runnable {
		
		private RWDictionary _dictionary;
		
		public Writer(RWDictionary dictionary) {
			_dictionary = dictionary;
		}
		
		@Override
		public void run() {
			while (true) {
				_dictionary.put("John", "Chicago");
				Utils.pause(1000);
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("start");
		
		RWDictionary rwd = new RWDictionary();

		rwd.put("Pete", "New-York");

		ExecutorService service = Executors.newCachedThreadPool();
		
		service.execute(new Reader(rwd));
		service.execute(new Reader(rwd));
		service.execute(new Reader(rwd));
		service.execute(new Reader(rwd));
		
		service.execute(new Writer(rwd));
		
		
	}
}