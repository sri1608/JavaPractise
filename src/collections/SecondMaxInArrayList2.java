package collections;

import java.util.ArrayList;

public class SecondMaxInArrayList2 {
	
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(23);
		list.add(75);
		list.add(2);
		list.add(62);
		list.add(18);
		int max = list.get(0);
		int secondmax = list.get(0);

		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) > max) {
				secondmax = max;
				max = list.get(i);
			}
				if(list.get(i) > secondmax && list.get(i) != max) {
					secondmax = list.get(i);
				
			}
		}			
	System.out.println(secondmax);
	}
}
