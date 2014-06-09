package lesson140609;


public class WorkerWithBlockingQueue {
	
	final private static Runnable POISON_PILL = new Runnable() {
		@Override
		public void run() {
		}
	};
	
	private BlockingQueue<Runnable> tasks = new BlockingQueue<>(); 
	
	private class WorkerBody implements Runnable {
		@Override
		public void run() {
			Runnable task;
			while (true) {
				task = tasks.poll();
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
	
	public WorkerWithBlockingQueue() {
		new Thread(new WorkerBody()).start();
	}
	
	public void execute(Runnable task) {
		tasks.offer(task);
	}
	
	public void shutdown() {
		execute(POISON_PILL);
	}
	
}