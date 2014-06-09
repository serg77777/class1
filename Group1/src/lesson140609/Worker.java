package lesson140609;

import java.util.LinkedList;
import java.util.Queue;

public class Worker {
	
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