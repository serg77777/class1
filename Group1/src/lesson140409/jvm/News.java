package lesson140409.jvm;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class News {
	
	private static NewsMaker _newsMaker;

	public static void main(String[] args) {
		
		_newsMaker = new MrPresident();
		
		System.out.println("start");
		
		startNewsMakerChanger();
		
		while (true) {
			
			waitForNews();
			
			String news = _newsMaker.getFreshNews();
			
			System.out.println(news);
			
		}
		
	}

	private static void startNewsMakerChanger() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				Scanner scanner = new Scanner(System.in);
				while (true) {
					if (scanner.hasNext()) {
						String line = scanner.nextLine();
						try {
							Class newClass = Class.forName(line);
							if (!NewsMaker.class.isAssignableFrom(newClass)) {
								System.out.println("Is not news maker");
								continue;
							}
							try {
								_newsMaker = (NewsMaker) newClass.newInstance();
							} catch (InstantiationException e) {
								e.printStackTrace();
							} catch (IllegalAccessException e) {
								e.printStackTrace();
							}
						} catch (ClassNotFoundException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}).start();
	}

	private static void waitForNews() {
		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
