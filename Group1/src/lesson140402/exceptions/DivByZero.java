package lesson140402.exceptions;

public class DivByZero {

	public static void main(String[] args) {
		
		int result = divide(100, 20);
		System.out.println(result);

		try {
			result = divide(100, 0);
		} catch (Exception ae) {
			if (ae.getClass() == ArithmeticException.class) {
//				if (ae instanceof ArithmeticException) {
//				if (ae.getClass().getSimpleName().equals("ArithmeticException")) {
				System.out.println("catched " + ae.getLocalizedMessage());
				result = Integer.MAX_VALUE;
			}
		}
		System.out.println(result);
		
		System.out.println("finished");
	}

	private static int divide(int i, int j) {
			return i/j;
	}

//		try {
//			return i/j;
//		} catch (ArithmeticException ae) {
//			System.out.println("catched " + ae.getLocalizedMessage());
//			return Integer.MAX_VALUE;
//		}
//	}
	
	
}
