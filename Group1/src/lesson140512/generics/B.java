package lesson140512.generics;

import java.io.Serializable;

public class B<T extends Number & Serializable > {

	private T state;

	public B(T state) {
		this.state = state;
	}

	public T getState() {
		return state;
	}
	
	public static void main(String[] args) {
		
//		B<String> b = new B<>("hello");  Compile ERROR
		Number n;
		
		B<Integer> b = new B<Integer>(10);
		B<Double> b2 = new B<Double>(10.65);
		
		B<Number> b3 = new B<Number>(10);
//		B<Number> b4 = new B<Integer>(10);   Compile ERROR
		
		B<? extends Number> b5 = new B<Integer>(10);
		B<?> b6 = new B<Integer>(10);
		B b7 = new B<Float>(10.3f);
		B b8 = new B(10);
		b8.getState();
		b6.getState();
		
	}

}
