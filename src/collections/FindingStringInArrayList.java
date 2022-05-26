package collections;

import java.util.ArrayList;

public class FindingStringInArrayList {

	public static void main(String[] args) {
		ArrayList <String> a = new ArrayList<>();

		a.add("java");
		a.add(" java satya");
		a.add("subha");
		a.add("sri");
		a.add("jaya");
		a.add(" java varsha");
		a.add("abcd");
		a.add("zyxw");


		System.out.println("array list contents");
		for(String element : a) {
			if(element.contains("java")) {
				System.out.println(element);
			}
		}
		

	}

}
