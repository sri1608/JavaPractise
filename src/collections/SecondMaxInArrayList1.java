package collections;

import java.util.ArrayList;

public class SecondMaxInArrayList1 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(23);
		list.add(75);
		list.add(2);
		list.add(62);
		list.add(18);
		int max = Integer.MIN_VALUE;
		int secondmax = Integer.MIN_VALUE;

		for (int i = 0; i < list.size(); i++) {
			
			if (list.get(i) > secondmax) {

				if (list.get(i) > max) {
					secondmax = max;
					max = list.get(i);
				} else {
					secondmax = list.get(i);
				}
		}
	}
		System.out.println(secondmax);

	}
}
