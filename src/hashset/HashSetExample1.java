package hashset;

import java.util.HashSet;

public class HashSetExample1 {

	public static void main(String[] args) {
		
		HashSet<String> s = new HashSet<>();
		s.add("sunday");
		s.add("monday");
		s.add("tuesday");
		s.add("wednesay");
		s.add("thursday");
		s.add("friday");
		s.add("saturday");
		s.add("sunday");
		s.add("monday");
		s.add("tuesday");
		s.add("friday");
		s.add("saturday");
		s.add("sunday");
		
		System.out.println("The days are :-");
		
		for(String day : s) {
			
			System.out.println(day);

		}
	}

}
