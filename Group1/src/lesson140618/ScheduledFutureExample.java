package lesson140618;

import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledFutureExample {

	
	private static final class CountdownTask implements Runnable {
		private ScheduledFuture<?> _countdownFuture;
		private int countdown = 10;

		private CountdownTask() {
		}

		@Override
		public void run() {
			System.out.println("time left = " + --countdown);
			if (countdown == 0) {
				_countdownFuture.cancel(true);
			}
		}

		public void setFuture(ScheduledFuture<?> countdownFuture) {
			_countdownFuture = countdownFuture;
		}
	}

	static class TimeoutAction implements Runnable {

		@Override
		public void run() {
			System.out.println("timeout occured!");
		}
		
	}
	
	private static ScheduledFuture<?> timeoutActionFuture;
	private static ScheduledFuture<?> countdownFuture;
	
	public static void main(String[] args) {
		
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		
		startTimeoutAndCountdown(service);
		
		Scanner scanner = new Scanner(System.in);
		
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			System.out.println(line);
			timeoutActionFuture.cancel(true);
			countdownFuture.cancel(true);
			startTimeoutAndCountdown(service);
		}
		
		
	}

	private static void startTimeoutAndCountdown(
			ScheduledExecutorService service) {
		timeoutActionFuture = service.schedule(new TimeoutAction(), 10, TimeUnit.SECONDS);
		
		CountdownTask countdownTask = new CountdownTask();
		countdownFuture = service.scheduleAtFixedRate(countdownTask, 1, 1, TimeUnit.SECONDS);
		countdownTask.setFuture(countdownFuture);
	}
	
}
