package strings;

import java.util.Scanner;

public class NumberOfVowels1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		s = s.toLowerCase();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

				count++;

			}
		}
		System.out.println("The number of vowels are " + count);
	}

}
