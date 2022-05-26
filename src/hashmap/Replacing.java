package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Replacing {

	public static void main(String[] args) {


		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "satya");
		map.put(2, "surya");
		map.put(3, "sri");
		map.put(4, "heera");

		System.out.println("initial list of members: ");
		
		for (Map.Entry m : map.entrySet()) {

			System.out.println(m.getKey() + " " + m.getValue());
			
		}
		System.out.println("updated list of members: ");

		map.replace(1," komatatlapalli");
		
		for (Map.Entry m : map.entrySet()) {

			System.out.println(m.getKey() + " " + m.getValue());
			
		}
		System.out.println("updated list of members: ");

		map.replaceAll((k,v)->" komatatlapalli");
		
		for (Map.Entry m : map.entrySet()) {

			System.out.println(m.getKey() + " " + m.getValue());
			
		}
	}

}
