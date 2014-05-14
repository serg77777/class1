package lesson140319;

public class ByValue {
	
	
	
	public static void main(String[] args) {
		final int i = 20;
		check(i);
		System.out.println(i);
	}
	
	private static void check(final int parameter) {
//		parameter = 30;  ERROR
	}
	
	

}
