package lesson140319;

public final class HidroPlan extends Boat implements AirVehicle {

	private Airplane airplane = new Airplane();

	@Override
	public void fly() {
		System.out.println("prepare hidroplan for flying");
		airplane.fly();
	}
	
	@Override
	public void sail() {
		System.out.println("my sail");
	}

}
