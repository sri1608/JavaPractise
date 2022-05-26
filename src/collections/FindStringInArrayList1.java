package collections;

import java.util.ArrayList;

public class FindStringInArrayList1 {

	public static void main(String[] args) {
		ArrayList <String> a = new ArrayList<>();

		a.add("Finding");
		a.add("the");
		a.add("strings");
		a.add("in");
		a.add("arraylist");
		String number = "strings";
		
		boolean found = false;
		for(int i = 0; i< a.size(); i++) {
			if(a.get(i) == number) {
				found = true;
				break;
			}
		}
		if(found) {
			System.out.println(number + " is in string " + a);
		}else {
			System.out.println(number + " is  not in string " + a);

		}
	}

}
