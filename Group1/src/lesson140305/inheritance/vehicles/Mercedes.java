package lesson140305.inheritance.vehicles;

public class Mercedes extends Engine {

	@Override
	public void start() {
		System.out.println("mercedes engine started");
		System.out.println("vvzzhhhhhhhhhh");
	}
	
	@Override
	public void stop() {
		System.out.println("mercedes engine stopped");
	}
	
}
