package lesson140512.generics;

public class RawTypes {

	public static void main(String[] args) {
		
		A<String> a = new A<String>("hello");  // CORRECT
		System.out.println(a);
		A a2 = new A<String>("hello");
		A a3 = new A("hello"); 
		A<String> a4 = new A(10);   // incorrect
		
		System.out.println(a4.getState());  // class cast exception!!
	}
	
}
