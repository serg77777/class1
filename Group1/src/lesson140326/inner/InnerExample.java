package lesson140326.inner;

import lesson140326.inner.B.Bi;

public class InnerExample {

	public static void main(String[] args) {
		B b = new B();
		Bi bi = b.new Bi();
		bi.printState();
		b.printMyState();
		
		B b2 = new B();
		b2.printMyState();
		
		C c = new C();
		Ci ci = new Ci(c);
		
		D d = new D();
		D.Di di = new D.Di(d);
		
	}
	
}
