package collections;

import java.util.ArrayList;

public class FindValuesInArray {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<> ();
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
		
		Integer element = a.get (2);
		Integer element1 = a.get (4);

		
		System.out.println("The element at index 2 :-" + element );
		System.out.println("The element at index 4 :-" + element1 );

	}
}
