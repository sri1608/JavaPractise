package hashmap;

import java.util.HashMap;
import java.util.Map;

public class NumberOccurance {

	public static void main(String[] args) {

		Map<Integer, Integer> numbercount = new HashMap<>();
		int a[] = { 1, 2, 3, 9, 5, 4, 9, 5, 3 };
		for (int i : a) {
			if (numbercount.containsKey(i)) {
				int count = numbercount.get(i);
				numbercount.put(i, count + 1);

			} else {
				numbercount.put(i, 1);
			}
		}
		for (Map.Entry m : numbercount.entrySet()) {
			System.out.println("The number of occurance of numbers " + m.getKey() + " is " + m.getValue());
		}
	}

}
