package hashmap;

import java.util.HashMap;
import java.util.Map;

public class ForAddingElement {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "satya");
		map.put(2, "surya");
		map.put(3, "sri");
		map.put(4, "heera");


		for (Map.Entry m : map.entrySet()) {

			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		System.out.println("adding  remaining student ");
		
		map.put(5, "sangram");

		for (Map.Entry m : map.entrySet()) {

			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		System.out.println("adding last entered student ");
		
		map.put(6, "rajendra");

		for (Map.Entry m : map.entrySet()) {

			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}
