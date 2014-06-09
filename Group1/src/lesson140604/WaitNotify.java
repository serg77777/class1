package lesson140604;

import java.util.Random;

import lesson140528.Utils;

public class WaitNotify {

	static String meal;
	static Object bell = new Object();

	final static String[] meals = { "soup", "steak", "salad", "beer",
			"pancakes" };

	static class Cook implements Runnable {

		@Override
		public void run() {
			Random random = new Random();

			while (true) {
				Utils.pause(1000 + random.nextInt(2000));
				synchronized (bell) {
					meal = meals[random.nextInt(meals.length)];
					System.out.println("Cook: " + meal);
					bell.notify();
				}
			}
		}
	}
	
// Producer - Consumer 
	
	static class Waiter implements Runnable {
		@Override
		public void run() {
			while (true) {
				synchronized (bell) {
					while (meal == null) {
						try {
							bell.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println("waiter: " + meal);
					meal = null;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Thread(new Cook()).start();
		new Thread(new Waiter()).start();
	}

}
