package lesson140512.generics;

public class D extends A<String>{

	public D(String state) {
		super(state);
	}
	
	public static void main(String[] args) {
		D d = new D("hello");
		System.out.println(d.getState());
	}

}
