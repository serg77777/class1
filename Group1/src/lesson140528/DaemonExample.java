package lesson140528;

import java.util.Random;

public class DaemonExample {

	static int happyNumber; 
	
	public static void main(String[] args) {
		
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Random random = new Random();
				while (true) {
					happyNumber = random.nextInt(100);
					Utils.pause(1000);
				}
			}
		});
		t.setDaemon(true);
		t.start();
		
		for (int i = 0; i < 10; i++) {
			Utils.pause(2000);
			System.out.println(happyNumber);
		}
		
	}
	
}
