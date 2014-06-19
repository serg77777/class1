package lesson140618;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

import lesson140528.Utils;

public class SerialExecutor implements Executor {
	final Queue<Runnable> tasks = new ArrayDeque<Runnable>();
	final Executor executor;
	Runnable active;

	public SerialExecutor(Executor executor) {
		this.executor = executor;
	}

	public synchronized void execute(final Runnable r) {
		tasks.offer(new Runnable() {
			public void run() {
				try {
					r.run();
				} finally {
					scheduleNext();
				}
			}
		});
		if (active == null) {
			scheduleNext();
		}
	}

	protected synchronized void scheduleNext() {
		if ((active = tasks.poll()) != null) {
			executor.execute(active);
		}
	}
	
	public static void main(String[] args) {
		
		class ThreadPerTaskExecutor implements Executor {
		     public void execute(Runnable r) {
		         new Thread(r).start();
		     }
		 }
		
		Executor executor = new ThreadPerTaskExecutor();
		
		Executor serialExecutor = new SerialExecutor(executor);
		
		class Task implements Runnable {
			@Override
			public void run() {
				System.out.println(Thread.currentThread() + " start task");
				Utils.pause(1000);
				System.out.println("finish task");
			}
		}
		
		serialExecutor.execute(new Task());
		serialExecutor.execute(new Task());
		serialExecutor.execute(new Task());
		
//		executor.execute(new Task());
//		executor.execute(new Task());
//		executor.execute(new Task());
		
	}
	
}
