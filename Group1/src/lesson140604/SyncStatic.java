package lesson140604;

public class SyncStatic {

	static int counter;
	
	synchronized static public void inc() {
		counter++;
	}
	
	static public void inc2() {
		synchronized (SyncStatic.class) {
			counter++;
		}
	}
	
	public static void main(String[] args) {
		
		inc();
		
	}
	
	
}
