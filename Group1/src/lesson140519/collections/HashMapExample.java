package lesson140519.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		
		Map<String, String> people = new HashMap<String, String>();
		people.put("John","New-York");
		people.put("Pete","San-Francisco");
		people.put("Ann","Boston");
		people.put("Mary","Boston");
		people.put("Mary","Chicago");
		
		System.out.println(people);
		
		String[] pair = new String[2];
		String[] pair = new String[2];
		
		String[][][] p = new String[4][][];
		
//		char c = "John".charAt(0);
		long code = "John".hashCode();
		int index = (int) (code % 4);
		p[index] = "New-York";
		
		System.out.println("John".hashCode());
		
	}
	
}
