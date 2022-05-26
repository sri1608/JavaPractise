package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MostOfOccuranceChar {

	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<>();
		char c[] = { 's', 'u', 'b', 'h', 'a', 's', 'r', 'i' };
		for (char i : c) {
			if (map.containsKey(i)) {
				int value = map.get(i);
				map.put(i, value + 1);
			} else {
				map.put(i, 1);

			}
		}
		int max = Integer.MIN_VALUE;
		for (Entry<Character, Integer> m : map.entrySet()) {

			if (max < m.getValue()) {
				max = m.getValue();

			}

		}
		for (Entry<Character, Integer> m : map.entrySet()) {
			if (m.getValue() == max) {
				System.out.println("most repeated number :- " + m.getKey());

			}
		}

	}
}
