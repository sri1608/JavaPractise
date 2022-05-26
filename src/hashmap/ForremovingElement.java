package hashmap;

import java.util.HashMap;

public class ForremovingElement {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "satya");
		map.put(2, "surya");
		map.put(3, "sri");
		map.put(4, "heera");

		System.out.println("initial list of members: " + map);
		
		map.remove(3);
		
		System.out.println("after removing list of members: " + map);	

	}

}
