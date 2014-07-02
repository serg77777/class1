package lesson140702;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class MapExample {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();

		Map<String, String> synchronizedMap = Collections.synchronizedMap(map);

		if (!synchronizedMap.containsKey("Pete")) {
			///
			synchronizedMap.put("Pete", "New-York");
		}

		ConcurrentMap<String, String> cmap = new ConcurrentHashMap<>();
		
		cmap.putIfAbsent("Pete", "New-York");
		
		
		
	}

}
