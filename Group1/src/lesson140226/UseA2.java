package lesson140226;

public class UseA2 {

	public static void main(String[] args) {
		
		A[]  arrayOfA = new A[10];
		
		for (A a : arrayOfA) {
			System.out.println(a);
		}
		
		for (int i = 0; i < arrayOfA.length; i++) {
			arrayOfA[i] = new A(i);
		}
		
		for (A a : arrayOfA) {
			System.out.println(a);
			System.out.println(a.state);
			System.out.println();
		}
		
		
	}
	
}
