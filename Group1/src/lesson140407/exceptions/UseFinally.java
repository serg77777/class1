package lesson140407.exceptions;

public class UseFinally {
	
	// try - catch -finally
	
	public static void main(String[] args) {
		
		// get resource  (open)
		System.out.println("open");
		try {
			//  work with resource
			System.out.println("work");
			doSomething();
			System.out.println("continue work");
		} finally {
			// free resource (close)
			System.out.println("close");
		}
		
		System.out.println("finish");
		
	}

	private static void doSomething() {
		throw new RuntimeException("disaster");
	}

}
