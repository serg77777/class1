package lesson140519.collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		
		Set<Character> chars = new HashSet<>();
		
		String s = "This is a big example of usage of the set";
		
		for (Character c : s.toLowerCase().toCharArray()) {
			chars.add(c);
		}
		
		System.out.println(chars);
		
		
	}
	
	
}
