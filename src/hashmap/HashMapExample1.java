package hashmap;

import java.util.HashMap;

public class HashMapExample1 {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "satya");
		map.put(2, "satyasri");
		map.put(3, "subha");
		map.put(4, "sri");
		map.put(5, "subhasri");

		System.out.println("size of map = " + map.size());
		
		System.out.println(map);
		
		
			
	}

}
