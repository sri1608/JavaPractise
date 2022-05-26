package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateCharacters {

	public static void main(String[] args) {

		String s = "subhasri komatlapalli";
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				int count = map.get(s.charAt(i));
				map.put(s.charAt(i), count + 1);
			} else {
				map.put(s.charAt(i), 1);
			}
		}
		for (Entry<Character, Integer> m : map.entrySet()) {
			if (m.getValue() > 1) {
				System.out.println(m.getKey() + " occurs " + m.getValue() + "  times");

			}
		}

	}
}