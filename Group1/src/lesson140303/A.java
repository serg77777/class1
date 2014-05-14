package lesson140303;


public class A {

	int state;
	B b = new B();
//	C c = new C();   ERROR
	
	public A(int state) {
		this.state = state;
	}
	
	public void printState() {
		System.out.println(this.state + ", " + b.getState());
	}
	
	
	
	
}
