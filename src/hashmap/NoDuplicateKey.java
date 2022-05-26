package hashmap;

import java.util.HashMap;
import java.util.Map;

public class NoDuplicateKey {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "satya");
		map.put(2, "subha");
		map.put(3, "sri");
		map.put(4, "komatlapalli");
		map.put(2, "subhasri");
		
		for (Map.Entry m : map.entrySet()) {

			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}
