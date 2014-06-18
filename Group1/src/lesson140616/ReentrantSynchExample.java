package lesson140616;

public class ReentrantSynchExample {

	
	static final Object mutex = new Object();
	
	public static void main(String[] args) {
		
		a();
		b();
		c();
		
	}

	private static void c() {
		synchronized (mutex) {
			a();
			b();
		}
		
	}

	private static void a() {
		synchronized (mutex) {
			System.out.println("Hello from a");
		}
	}
	
	private static void b() {
		synchronized (mutex) {
			System.out.println("Hello from b");
		}
	}
	
	

	
	
}
