package lesson140512.generics;

public class A<T> {

	T state;
	
	public A(T state) {
		this.state = state;
	}
	
	T getState() {
		return state;
	}
	
	public static void main(String[] args) {
		
		A<String> a = new A<>("hello");
		
//		Integer i = a.getState();  Compile ERROR
		String s = a.getState();
		
		A<Integer> a2 = new A<>(10);
		Integer i = a2.getState(); 
//		s = a2.getState();   Compile ERROR
		
		/*\
		 * 
		 * E  element
		 * K  key
		 * N  number
		 * T  type
		 * V value
		 * S,U,X
		 * 
		 */
		
		
		
	}

}
