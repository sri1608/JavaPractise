package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class UniqueNumberSum {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		int a[] = { 1, 2, 3, 4, 5, 6, 5, 4, 3, };
		for (int i : a) {
			if (map.containsKey(i)) {
				int value = map.get(i);
				map.put(i, value + 1);
			} else {
				map.put(i, 1);
			}
		}
		int sum = 0;
		for (Entry<Integer, Integer> m : map.entrySet()) {
			if (m.getValue() == 1) {
				sum += m.getKey();

			}
		}
		System.out.print(sum);
	}

}
