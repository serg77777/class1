package lesson140618;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import lesson140528.Utils;

public class ThreadFactoryExample {

	public static void main(String[] args) {
		
		ExecutorService service = Executors.newCachedThreadPool(new ThreadFactory() {
			@Override
			public Thread newThread(Runnable r) {
				Thread t = new Thread(r);
				t.setName("mythread");
				t.setDaemon(true);
				return t;
			}
		});
		
		service.execute(new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread());
			}
		});
		
		Utils.pause(1000);
	}
	
}
