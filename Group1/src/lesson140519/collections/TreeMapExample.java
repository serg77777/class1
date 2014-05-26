package lesson140519.collections;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		TreeMap<String, String> people = new TreeMap<>();
		
		people.put("John","New-York");
		people.put("Pete","San-Francisco");
		people.put("Ann","Boston");
		people.put("Mary","Boston");
		people.put("Mary","Chicago");
		
		
	
		System.out.println(people);

	}
	
}
