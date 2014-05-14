package lesson140331.innerlocal;

public class A implements I {
	@Override
	public void doIt() {
		System.out.println("did it");
	}
	
	public I getImplementorOfI() {
		return this;
	}

}
