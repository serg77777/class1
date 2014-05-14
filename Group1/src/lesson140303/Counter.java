package lesson140303;

public class Counter {
	
	private int count = 0;
	
	public void inc() {
		count++;
		System.out.println("changed state");
	}
	
	public int get() {
		System.out.println("requested state");
		return count;
	}

}
