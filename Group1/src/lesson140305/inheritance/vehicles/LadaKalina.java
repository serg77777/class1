package lesson140305.inheritance.vehicles;

public class LadaKalina extends Car {

	public LadaKalina() {
		super(new Vaz(), new Wheel[4], new Chassis());
	}
	
	@Override
	protected void mountWheels() {
		for (int i = 0; i < getNumberOfWheels(); i++) {
			mountWheel(new Wheel(), i);
		}
	}
	
}
