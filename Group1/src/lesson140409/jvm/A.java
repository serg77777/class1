package lesson140409.jvm;

public class A {
	
	int state = 10;
	
	public void changeState() {
		System.out.println("state change");
		state += 10;
	}

}
