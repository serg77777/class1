package lesson140226;

public class UseScope {

	public static void main(String[] args) {
		
		C c = new C (new B("First")) ;
		{
			C c2 = c;
			c2.doIt();
		}

		c.doIt();
		
	}
	
}
