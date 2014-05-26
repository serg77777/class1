package lesson140526;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExamples {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		System.out.println(list);
		
		Collections.rotate(list, 1);
		
		System.out.println(list);
		
		Collections.rotate(list, -2);

		System.out.println(list);
		
		Collections.shuffle(list);
		
		System.out.println(list);
		
		System.arraycopy(src, srcPos, dest, destPos, length);
	}
	
}
