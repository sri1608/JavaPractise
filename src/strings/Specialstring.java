package strings;

import java.util.Scanner;

public class Specialstring {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean b = false;
		
		for (int i = 0; i < s.length()-1; i++) {
			
			char first = s.charAt(i);
			char second = s.charAt(i + 1);
			
			if (isOwel(first) && isOwel(second)) {
				
				b = true;
				break;
			}
		}
		
		if (b) {
			
			System.out.println(s + " : is a special string");
		}
		else {
			
			System.out.println(s + " : is not a special string");
		}
	}
	
	private static boolean isOwel(char ch) {
		
		if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
				|| ch == 'o' || ch == 'u') {
			
			return true;	
		} 
		else {
			
			return false;
		}
	}
}