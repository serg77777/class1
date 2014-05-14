package lesson140305.inheritance.vehicles;

public class MercedesS300 extends Car {

	public MercedesS300() {
		super(new Mercedes(), new Wheel[4], new Chassis());
	}
	
	@Override
	protected void mountWheels() {
		for (int i = 0; i < 4; i++) {
			mountWheel(new Michelin(), i);
		}
	}

}
