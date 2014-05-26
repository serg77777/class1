package lesson140519.collections;

import java.util.TreeMap;

public class OrderedOperations {

	public static void main(String[] args) {
		
		TreeMap<String, String> calls = new TreeMap<>();
		
		calls.put("09:10", "Moscow");
		calls.put("21:10", "St.Pete");
		calls.put("19:20", "New-York");
		calls.put("14:40", "St.Pete");
		calls.put("15:30", "Moscow");
		calls.put("09:10", "Moscow");
		calls.put("08:30", "New-York");
		calls.put("13:50", "St.Pete");
		calls.put("23:00", "Moscow");
		calls.put("22:10", "Moscow");
		calls.put("06:10", "St.Pete");
		calls.put("03:06", "New-York");
		
		System.out.println(calls);
		System.out.println(calls.ceilingEntry("12:00"));
		System.out.println(calls.floorEntry("12:00"));
		System.out.println(calls.subMap("12:00", "18:00"));
		System.out.println(calls.firstEntry());
		System.out.println(calls.lastEntry());
		System.out.println(calls.headMap("12:00"));
		System.out.println(calls.tailMap("12:00"));
		
	}
	
}
