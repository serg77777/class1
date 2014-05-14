package lesson140305.inheritance.vehicles;

public class Vaz extends Engine {

	@Override
	public void start() {
		System.out.println("vaz engine started");
	}
	
	@Override
	public void stop() {
		System.out.println("vaz engine stopped");
	}
	
}
