package collections;

import java.util.ArrayList;

public class MinValuesInArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer>list = new ArrayList<>();
		
list.add(42);
list.add(53);
list.add(75);
list.add(2);
list.add(62);
list.add(18);
int min = Integer.MAX_VALUE;

for(int i = 0; i < list.size(); i++) {
	
	if(list.get(i) < min) {
	
		min = list.get(i);
	}
}

System.out.println(min + " is the lowest value in the array.");


	}

}
