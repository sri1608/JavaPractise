package strings;

import java.util.Scanner;

public class FindingLetter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char key = sc.next().charAt(0);
		boolean found = false;
		
		for(int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i) == key) {
				
				found = true;
				
				break;
			}
		}
		
		if(found) {
			
			System.out.println(key + " is in string of " + s);
		}
		else {
			
			System.out.println(key + " is  not in string  of " + s);

		}
	}

}
