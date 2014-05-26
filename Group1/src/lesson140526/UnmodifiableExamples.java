package lesson140526;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableExamples {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(90);
		list.add(20);
		list.add(90);
		list.add(140);
		list.add(-10);
		
		System.out.println(list);
		
		List<Integer> list2 = Collections.unmodifiableList(list);
		
		list2.add(20);
		
	}
	
}
