package lesson140519.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		
		Map<Character, Integer> chars = new HashMap<>(); 
		
		String s = "This is a big example of usage of the set";
		
		for (Character c : s.toLowerCase().toCharArray()) {
			if (!chars.containsKey(c)) {
				chars.put(c, 0);
			}
			int count = chars.get(c);
			count++;
			chars.put(c, count);
		}
		
		System.out.println(chars);
		
	}
	
}
