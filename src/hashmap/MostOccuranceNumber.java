package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MostOccuranceNumber {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		int a[] = { 5, 9, 4, 9, 5, 4, 9, 5, 5 };

		for (int i : a) {

			if (map.containsKey(i)) {
				int value = map.get(i);
				map.put(i, value + 1);

			} else {
				map.put(i, 1);
			}

		}
		int max = Integer.MIN_VALUE;
		for (Entry<Integer, Integer> m : map.entrySet()) {

			if (max < m.getValue()) {
				max = m.getValue();

			}

		}
		for (Entry<Integer, Integer> m : map.entrySet()) {
			if (m.getValue() == max) {
				System.out.println("most repeated number :- " + m.getKey());

			}
		}

	}
}
