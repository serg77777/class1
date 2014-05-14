package lesson140512.generics;

public class C<T> extends A<T>{

	public C(T state) {
		super(state);
	}
	
	public static void main(String[] args) {
		
		C<String> c = new C<>("Hello");
		
		String s = c.getState();
		
		System.out.println(s);
		
	}

}
