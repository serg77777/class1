package lesson140512.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class GenEx {

	static class A {
		
	}
	
	
	public static void main(String[] args) {
		
		
		Vector<String> vs = new Vector<>();  // diamond  7.0
		
//		vs.add(new Integer(10)); // ERROR!
		
		vs.add("hello");
		
		String s = vs.get(0);
		
		Vector<Integer> vi = new Vector<Integer>();
		
//		vi.add("hello");   ERROR!
		
		vi.add(10);
		
		int i = vi.get(0);
		
		System.out.println(i);
		
		
		
		List<A> list = new ArrayList<A>();
		
		list.add(new A());
		
		A a = list.get(0);
		
		
	}
	
	
}
