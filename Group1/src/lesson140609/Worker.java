package lesson140609;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Executor;

public class Worker implements Executor {
	
	final private static Runnable POISON_PILL = new Runnable() {
		@Override
		public void run() {
		}
	};
	
	private Queue<Runnable> tasks = new LinkedList<>(); 
	
	private class WorkerBody implements Runnable {
		@Override
		public void run() {
			Runnable task;
			while (true) {
				synchronized (tasks) {
					while (tasks.isEmpty()) {
						try {
							tasks.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					task = tasks.poll();
				}
				if (task == POISON_PILL) {
					break;
				}
				try {
					task.run();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public Worker() {
		new Thread(new WorkerBody()).start();
	}
	
	@Override
	public void execute(Runnable task) {
		synchronized (tasks) {
			tasks.add(task);
			tasks.notify();
		}
	}
	
	public void shutdown() {
		execute(POISON_PILL);
	}
	
}