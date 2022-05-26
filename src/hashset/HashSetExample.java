package hashset;

import java.util.*;

public class HashSetExample {

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

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the week names");
		String s1 = sc.next();
		if(s.contains(s1)) {
			System.out.println("entered the valid week");
	
		}else {
			System.out.println("not the valid week");

		}
	}
}
