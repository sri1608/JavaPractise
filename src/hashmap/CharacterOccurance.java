package hashmap;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurance {

	public static void main(String[] args) {


		Map<Character, Integer> charcount = new HashMap<>();
		char a[] = {'s', 'u', 'b', 'h', 'a' };
		for (char i : a) {
			if (charcount.containsKey(i)) {
				int count = charcount.get(i);
				charcount.put( i, count + 1);

			} else {
				charcount.put(i, 1);
			}
		}
		for (Map.Entry m : charcount.entrySet()) {
			System.out.println("The number of occurance of numbers " + m.getKey() + " is " + m.getValue());
		}
	}

}
