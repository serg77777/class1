package lesson140512.generics;

import java.util.Arrays;
import java.util.List;

public class Capture {

	static void foo(List<?> list) {
		fooHelper(list);
	}

	static private <T> void fooHelper(List<T> list) {
		list.set(0, list.get(0));
	}
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3);
		
		foo(list);
		
	}
	
}
