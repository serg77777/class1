package lesson140324;

public class UsePoly {

	public static void main(String[] args) {
		
		int i = 10;
		
//		A a = new A();
//		
//		a = new C();
//		
//		a.changeState();
		
		useInt(i);  // AutoBoxing  useInt(new Integer(i));
		
		useNumber(i);
		Number number = new MyInteger(100);
		useNumber(number);
		useNumber(20.45456);
	}
	
	
	private static void useNumber(Number i) {
		System.out.println(i.toString());
	}

	public void changeIt(A a) {
		a.changeState();
	}
	
//	public static void useInt(int param) {
//		System.out.println("primitive");
//	}
	
	public static void useInt(Integer param) {
		System.out.println(param);
	}
	
	
	
	
}
