package lesson140409.jvm;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Worker {

	static class Data {
		int[] scientificData = new int[10000];
	}
	
	public static void main(String[] args) {
		
		while (true) {
			work();
			rest();
		}
	}

	private static void rest() {
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void work() {
		Random r = new Random();
		for (int i = 0; i < 10000; i++) {
			Data d = new Data();
			for (int j = 0; j < d.scientificData.length; j++) {
				d.scientificData[j] = r.nextInt();
			}
		}
	}
	
}
