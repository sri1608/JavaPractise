package hashmap;

import java.util.HashMap;

public class ForAddingElement1 {
           
	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "satya");
		map.put(2, "satyasri");
		map.put(3, "subha");
		map.put(4, "sri");
		map.put(5, "subhasri");
		HashMap<Integer, String> map1 = new HashMap<>();
		map1.putAll(map);

		System.out.println("mapping of Hashmap map is " + map);
		System.out.println("mapping of Hashmap map1 is " + map1);
	}

}
