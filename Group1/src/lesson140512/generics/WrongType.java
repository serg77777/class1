package lesson140512.generics;

import java.util.Vector;

public class WrongType {
	
	static class VectorOfString extends Vector {
		
		void add(String string) {
			super.add(string);
		}
		
		public String get(int index) {
			return (String)super.get(index);
		}
		
	}

	static class VectorOfInteger extends Vector {
		
		void add(Integer integer) {
			super.add(integer);
		}
		
		public Integer get(int index) {
			return (Integer)super.get(index);
		}
		
	}
	
	public static void main(String[] args) {
		
		Vector v = new Vector();
//		v.add("hello");
		v.add(new Integer(10));
		
		String s = (String) v.get(0);
		
		System.out.println(s);
		
		VectorOfString vos = new VectorOfString();
		vos.add("hello");
		s = vos.get(0);

		VectorOfInteger voi = new VectorOfInteger();
		voi.add(new Integer(10));
		voi.add("hello");
		Integer i = voi.get(0);
	}
	
}
