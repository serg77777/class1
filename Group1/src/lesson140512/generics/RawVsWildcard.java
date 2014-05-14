package lesson140512.generics;

import java.util.ArrayList;
import java.util.List;

public class RawVsWildcard {
	
	public static void main(String[] args) {
		
		List<?> list1 = new ArrayList<Integer>();
		List list2 = new ArrayList<Integer>();
		
		list1.add("hello");
		list2.add("hello");
		
	}

}
