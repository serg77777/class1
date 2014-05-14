package lesson140512.generics;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Pair<K,V> {

	private K key;
	private V value;
	
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K key() {
		return key;
	}
	
	public V value() {
		return value;
	}
	
	public static void main(String[] args) {
		
		Pair<Integer,String> pis = new Pair<Integer, String>(10, "hello");
		Pair<String,String> pss = new Pair<String, String>("one", "hello");
		
		Pair<Integer,A<String>> pia = new Pair<>(10,new A<String>("hello"));
		
		List<List<String>> listOfListOfString = new LinkedList<List<String>>();
		
		listOfListOfString.add(Arrays.asList("one", "two", "three"));
		listOfListOfString.add(Arrays.asList("four", "five", "six"));
		listOfListOfString.add();
		
		Arrays.asList(10, "five", "six");
		
		for (List<String> list : listOfListOfString) {
			System.out.println(list);
		}
		
	}
	
}
