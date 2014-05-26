package lesson140526;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CheckedWrapperExample {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		Arrays.asList(0);
		
		list.add(20);
		list.add(30);
		list.add(40);
		
		List list2 = list;
		
		list2.add("hello");
		
		System.out.println(list2);
		
		List<Integer> checkedList = Collections.checkedList(list, Integer.class);
		
		list2 = checkedList;
		
		list2.add("Hello 2");
	}
	
}
