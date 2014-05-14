package lesson140303.statics;

public class Singleton {
	
	private static Singleton instance;
	static int count;
	
	static Singleton getInstance() {
		if (instance == null) {    //  lazy instantiation
			 instance = new Singleton();
		}
		return instance;
	}
	
	static void setInstance(Singleton instance) {
		Singleton.instance = instance;
	}
	
	static void printStatus() {
		System.out.println("instances created = " + count);
	}
	

	int id;
	
	{
		id = count++;
		System.out.println("I am newly created singleton #" + id);
	}
	
	private Singleton() {
		
	}

	public void saySomething() {
		System.out.println("something from " + id);
	}

}
