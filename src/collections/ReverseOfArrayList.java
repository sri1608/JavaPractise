package collections;

import java.util.ArrayList;

public class ReverseOfArrayList {

	public static void main(String[] args) {

	ArrayList <Integer> a = new ArrayList<>();
	a.add(11);
	a.add(99);
	a.add(22);
	a.add(55);

	int temp[] = new int[a.size()];
	
	for(int i = a.size()-1, j = 0; i >= 0; i-- , j++) {
		temp[j] = a.get(i);
	}
	for(int i = 0; i < a.size(); i++) {
		System.out.print(temp[i] + ", ");
	}
		
	}

}
