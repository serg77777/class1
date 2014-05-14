package lesson140226;

public class E {

	{
		System.out.println("initialized " + this);
	}
	
	public E(int i) {
		System.out.println("created with i = " + i);
	}
	
	public E() {
		System.out.println("created " + this);
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("destoyed " + this);
	}
	
	
}
