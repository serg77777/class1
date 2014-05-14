package lesson140305.inheritance2;

import lesson140305.inheritance.C;

public class D extends C {

//	C c = new C();
	
	public void doIt() {
		changeState();
	}
	
	@Override
	public void changeState() {
		System.out.println("state before " + state);
		super.changeState();
		System.out.println("state after " + state);
	}
	
	public int getState() {
		return state;
	}
	
	
}
