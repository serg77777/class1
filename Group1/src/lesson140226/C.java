package lesson140226;

public class C {

	B b;
	
	C () {
	}
	
	C (B b) {
		this.b = b;
	}
	
	void doIt() {
		if (b == null) {
			b = new B("Slave of the Lamp");
		}
		b.doIt();
	}
	
	void doItAgainWith(B b) {
		b.doIt();
	}
	
}
