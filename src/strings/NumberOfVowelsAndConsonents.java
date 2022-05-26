package strings;

import java.util.Scanner;

public class NumberOfVowelsAndConsonents {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		int vcount = 0, ccount = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o'
					|| c == 'u') {
				vcount++;
			} else if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
				ccount++;
			}
		}
		
		System.out.println("the vowel count " + vcount);
		System.out.println("the vowel count " + ccount);
	}
}
