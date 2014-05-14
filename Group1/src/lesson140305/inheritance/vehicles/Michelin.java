package lesson140305.inheritance.vehicles;

public class Michelin extends Wheel {
	
	@Override
	public void makeSound() {
		System.out.println("woooooooooow");
		super.makeSound();
		System.out.println("wheeeeeeeee");
	}

}
