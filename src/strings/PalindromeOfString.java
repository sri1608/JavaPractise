package strings;

import java.util.Scanner;

public class PalindromeOfString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {

			rev = rev + s.charAt(i);
		}
		
		if (s.equals(rev)){
			
			System.out.println("it is an palindrome");
			
		} else {
			
			System.out.println("it is  not an palindrome");

		}
	}
}
