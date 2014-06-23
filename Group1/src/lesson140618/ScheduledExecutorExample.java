package lesson140618;

import java.util.Calendar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import lesson140528.Utils;

public class ScheduledExecutorExample {

	static class Task implements Runnable {
		
		private int count;
		
		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName() + " count = " + (count++));
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("start");
		
		ScheduledExecutorService service = Executors.newScheduledThreadPool(3);
		
		service.schedule(new Task(), 3, TimeUnit.SECONDS);
		
		service.scheduleAtFixedRate(new Task(), 5, 1, TimeUnit.SECONDS);

		service.scheduleWithFixedDelay(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("begin" + Calendar.getInstance().getTime());
				Utils.pause(1000);
				System.out.println("end" + Calendar.getInstance().getTime());
			}
		}, 6, 3, TimeUnit.SECONDS);
		
//		service.shutdown();
	}
	
	
}
