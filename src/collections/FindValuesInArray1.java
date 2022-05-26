package collections;

import java.util.ArrayList;

public class FindValuesInArray1 {

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<>();
		a.add(12);
		a.add(113);
		a.add(152);
		a.add(657);
		a.add(12547);
		a.add(678);
		a.add(1562);
		a.add(512);
		System.out.println("list is " + a.size());
		System.out.println("list " + a);
		int number = 555;

		boolean find = false;

		for (int i = 0; i < a.size(); i++) {

			if (number == a.get(i)) {

				find = true;
				break;
			}
		}

		if (find) {

			System.out.println(number + " is found");

		} else {

			System.out.println(number + " not found");
		}
	}

}
