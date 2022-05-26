package hashmap;

import java.util.HashMap;

public class ByUsing2HashMaps {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();
		HashMap<Integer, String> map1 = new HashMap<>();
		map.put(1, "satya");
		map.put(2, "satyasri");
		map1.put(3, "subha");
		map1.put(4, "sri");
		map1.put(5, "subhasri");

		System.out.println("mapping of Hashmap map is " + map);
		System.out.println("mapping of Hashmap map1 is " + map1);

		
		
	}

}
