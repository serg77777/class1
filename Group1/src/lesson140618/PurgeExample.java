package lesson140618;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class PurgeExample {

	public static void main(String[] args) {
		
		ScheduledThreadPoolExecutor service = 
				(ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(2);
		
		List<ScheduledFuture<?>> futures = new LinkedList<>();
		for (int i = 0; i < 1000; i++) {
			ScheduledFuture<?> scheduledFuture = service.schedule(new Runnable() {
				@Override
				public void run() {
					System.out.println("hello");
				}
			}, 10, TimeUnit.SECONDS);
			
			futures.add(scheduledFuture);
		}
		
		for (ScheduledFuture<?> scheduledFuture : futures) {
			scheduledFuture.cancel(true);
		}
		
		service.purge();
		
	}
	
	
}
