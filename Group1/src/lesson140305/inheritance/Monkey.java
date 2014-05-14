package lesson140305.inheritance;

public class Monkey extends Animal {

	@Override
	public void makeSound() {
		System.out.println("wooop-woop!");
	}

	@Override
	public void feed(String food) {
		if (food.equals("banana")) {
			System.out.println("whooooooooooop!!!!");
		} else {
			System.out.println("....");
		}
	}

	@Override
	protected void walk() {
		// TODO Auto-generated method stub
		
	}

}
