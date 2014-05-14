package lesson140226;

public class UseA {
	
	public static void main(String[] args) {
		
		A a = new A(10);
		a.changeState();
		System.out.println(a.state);
		a.changeState();
		System.out.println(a.state);
		
		A a2 = new A(-2);
		a2.changeState();
		System.out.println(a2.state);
		
		System.out.println(a);
		System.out.println(a2);
		
		int x = 10;
		int y = x;
		x = 20;
		
		A a3 = a;
		System.out.println(a3);

		a3.changeState();
		System.out.println(a.state);
		
		A a4 = new A();
		
	}

}
