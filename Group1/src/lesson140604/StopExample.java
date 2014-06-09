package lesson140604;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lesson140528.Utils;

public class StopExample {
	
	static class Car {
		String engine;
		String chassis;
		String[] wheels;

		public void mountEngine(String engine) {
			this.engine = engine;
		}
		public void mountChassis(String chassis) {
			this.chassis = chassis;
		}
		public void mountWheels(String[] wheels) {
			this.wheels = wheels;
		}
		@Override
		public String toString() {
			return engine + ", " + chassis + ", " + Arrays.toString(wheels);
		}
	}
	
	static private boolean stopped;
	
	public static void main(String[] args) {
		
		final List<Car> readyCars = new ArrayList<>();
		
		Thread carFactory = new Thread(new Runnable() {
			

			@Override
			public void run() {
				while (!stopped) {
					Car car = new Car();
					readyCars.add(car);
					buildCar(car);
				}
				
			}
		});
		carFactory.start();
		
		Utils.pause(12000);
		
//		carFactory.stop();
//		carFactory.interrupt();
		stopped = true;
		
		
		try {
			carFactory.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for (Car car : readyCars) {
			System.out.println(car);
		}
		
	}

	public static Car buildCar(Car car) {
		Utils.pause(1000);
		car.mountEngine("M-300");
		Utils.pause(1000);
		car.mountChassis("C-20");
		Utils.pause(1000);
		car.mountWheels(new String[] {"left", "right", "back-left", "back-right"});
		return car;
	}
	

}
