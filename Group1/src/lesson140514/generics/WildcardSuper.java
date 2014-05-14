package lesson140514.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class WildcardSuper {

	public static void main(String[] args) {
		List<Integer> list2 = new ArrayList<>();
		List<Float> list3 = new LinkedList<>();

		fill(list2, 10, 0);
		fill(list3, 10, 0);
		
	}

	private static void fill(List<? super Integer> list2, int qty, int value) {
		for (int i = 0; i < qty; i++) {
			list2.add(value);
		}
		
	}
	
}
