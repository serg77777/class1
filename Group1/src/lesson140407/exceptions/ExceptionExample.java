package lesson140407.exceptions;

public class ExceptionExample {
	
	public static class MyException extends Exception {  //checked exception
	}

	public static class MyException2 extends MyException {
	}
	
	public static void main(String[] args) {
		
		try {
			doSomething();
//		} catch (MyException2 e) {
//			System.out.println("MyException2");
//		} catch (MyException e) {
//			System.out.println("MyException");
		} catch (Exception e) {
			System.out.println("Exception");
		}
		
	}

	private static void doSomething() throws MyException2 {
		try {
			doAnotherThing();
		} catch (MyException e) {
			System.out.println("MyException");
		}
		// ....
		throw new MyException2();
	}

	private static void doAnotherThing() throws MyException {
		throw new MyException();
	}

}
