package lesson140428.variable;

public class Example2 {

	
	static void vaTest(int ... v) {
		
	}
	
	static void vaTest(boolean ... v) {
		
	}
	
	public static void main(String[] args) {
		vaTest(1,2,3);
		vaTest(true, false, false);
//		vaTest();  compile error
	}
	
}
