package collections;

import java.util.ArrayList;

public class MaxValuesInArrayList {

	public static void main(String[] args) {

		ArrayList<Integer>list = new ArrayList<>();
		
		list.add(99);
		list.add(53);
		list.add(75);
		list.add(2);
		list.add(62);
		list.add(18);
		int max = Integer.MIN_VALUE;

		for(int i = 0; i < list.size(); i++) {
			
			if(list.get(i) > max) {
			
				max = list.get(i);
			}
		}

		System.out.println(max + " is the highest value in the array.");


	}

}
