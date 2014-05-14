package lesson140305.inheritance;

public class InheritanceExamples {
	
	public static void main(String[] args) {
		
		A a = new A();
		
		a.setState(10);
		
		System.out.println(a.getState());
		
		B b = new B();
		
		b.setState(20);
		b.doubleState();
		
		System.out.println(b.getState());
		
		
	}

}
