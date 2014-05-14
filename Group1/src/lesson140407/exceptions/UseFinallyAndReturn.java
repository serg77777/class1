package lesson140407.exceptions;

public class UseFinallyAndReturn {

	public static void main(String[] args) {
		System.out.println(calculateSomething());
	}

	private static int calculateSomething() {
		int result = 0; 
		try {
			result = 100 / 20;
			return result;
		} finally {
			return 10;
		}
	}
	
}
