package lesson140226;

public class UseObjects {
	
	public static void main(String[] args) {
		
		B b = new B("First");
		C c = new C(b);
		
		B b2 = new B("Second");
		
//		c.b = b;
		
		
		c.doIt();
		
		c.doItAgainWith(b2);
		
//		D d = new D();
//		D d2 = new D();
//		
//		d.doIt(d2);
//
		C c2 = new C();
		c2.doIt();
		
	}

}
