package lesson140326.inner;

public class A {
	private static int counter;

	
	protected static class Ai {
		
		public static void printCounter() {
			System.out.println(counter);
		}
		
		public void printState() {
			System.out.println(state);
		}
		
	}


	private int state = 20;
	
	public int getState() {
		return state;
	}
	
}
