package lesson140226;

public class D {

	void doIt(D d) {
		System.out.println("I said DO IT to " + d);
		d.doIt(this);
	}
	
}
