package lesson140519.collections;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

	public static void main(String[] args) {

		LinkedHashMap<String, String> calls = new LinkedHashMap<>();

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
		
		for (String time : calls.keySet()) {
			System.out.println(time + " : " + calls.get(time));
		}
	}

}
