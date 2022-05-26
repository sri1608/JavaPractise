package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MostOccuranceString {

	public static void main(String[] args) {

		
			Map<String, Integer> map = new HashMap<>();
			String s[] = {"satya", "subha", "sri", "sangram", "sri", "sangram" };
			for (String i : s) {
				if (map.containsKey(i)) {
					int value = map.get(i);
					map.put(i, value + 1);
				} else {
					map.put(i, 1);

				}
			}
			int max = Integer.MIN_VALUE;
			for (Entry<String, Integer> m : map.entrySet()) {

				if (max < m.getValue()) {
					max = m.getValue();

				}

			}
			for (Entry<String, Integer> m : map.entrySet()) {
				if (m.getValue() == max && m.getValue() !=1) {
					System.out.println("most repeated string :- " + m.getKey());

				}
			}
	}

}
