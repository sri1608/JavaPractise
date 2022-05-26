package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LongestString {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		String s[] = {"satya", "subha", "sri", "sangram"};
		for (String str : s) {
			map.put(str, str.length());
		}
		int max = Integer.MIN_VALUE;
		for (Entry<String, Integer> m : map.entrySet()) {

			if (max < m.getValue()) {
				max = m.getValue();

			}

		}
		for (Entry<String, Integer> m : map.entrySet()) {
			if (m.getValue() == max ) {
				System.out.println("longest string :- " + m.getKey());

			}
		}
	}

}
