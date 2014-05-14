package lesson140305.inheritance;

public abstract class HomeAnimal extends Animal {
	
	abstract public void brush();
	
	@Override
	protected void walk() {
		System.out.println("walk");
	}

}
