package lesson140324;

public class C extends B {

	@Override
	public void changeState() {
		state -= 100;
		super.changeState();
	}
	
	public static void main(String[] args) {
		
		C c = new C();
		c.changeState();
		
	}
	
}

