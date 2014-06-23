package lesson140618;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import lesson140528.Utils;

public class CyclicBarrierExample {
	
	static class Task implements Runnable {

		private CyclicBarrier _barrier;

		public Task(CyclicBarrier barrier) {
			_barrier = barrier;
		}
		
		@Override
		public void run() {
			Random random = new Random(); 
			while (true) {
				Utils.pause(3000 + random.nextInt(3000));
				try {
					_barrier.await();
					System.out.println(Thread.currentThread().getName());
				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (BrokenBarrierException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		CyclicBarrier barrier = new CyclicBarrier(3, new Runnable() {
			@Override
			public void run() {
				System.out.println("all threads have reached the barrier");
			}
		});
		
		ExecutorService service = Executors.newCachedThreadPool();
		
		service.execute(new Task(barrier));
		service.execute(new Task(barrier));
		Future<?> future = service.submit(new Task(barrier));
		
		Utils.pause(1000);
		
		future.cancel(true);
		
	}

}
