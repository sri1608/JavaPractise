package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "satya");
		map.put(2, "satyasri");
		map.put(3, "subha");
		map.put(4, "sri");
		map.put(5, "subhasri");

		//for (Entry<Integer, String> m : map.entrySet()) {
		for (Map.Entry m : map.entrySet()) {

			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}
