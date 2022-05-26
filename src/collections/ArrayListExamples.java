package collections;

import java.util.*;

public class ArrayListExamples {

	public static void main(String[] args) {
ArrayList<Integer> list = new ArrayList <>();

Scanner sc = new Scanner(System.in);
System.out.println("Enter the values");
int arr[] = new int[5];

	for(int i = 0; i < 5; i++) {
		list.add(sc.nextInt());	
	}
	list.add(65);
	list.add(81);
	list.add(73);
	list.add(61);
	list.add(72);

	for(int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i));
	}
	}

}
