package lesson140618;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;

import lesson140528.Utils;

public class SynchronousQueueExample {

	public static void main(String[] args) {

		System.out.println("start");
		
		ExecutorService producerService = Executors.newSingleThreadExecutor();
		ExecutorService consumerService = Executors.newSingleThreadExecutor();

		final BlockingQueue<String> queue = new SynchronousQueue<>();

		producerService.execute(new Runnable() {

			@Override
			public void run() {
				try {
					System.out.println("trying put");
					queue.put("hello");
					System.out.println("successful put");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		consumerService.execute(new Runnable() {

			@Override
			public void run() {
				try {
					Utils.pause(2000);
					System.out.println("trying take");
					System.out.println(queue.take());
					System.out.println("successful take");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

	}

}
