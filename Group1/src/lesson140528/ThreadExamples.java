package lesson140528;

public class ThreadExamples {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		
		Thread t = new Thread() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		System.out.println(t.getState());
		
		t.start();
		
		for (int i = 0; i < 3; i++) {
			System.out.println(t.getState());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(t.getState());
	}
	
}
