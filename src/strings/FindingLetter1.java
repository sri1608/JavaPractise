package strings;

import java.util.Scanner;

public class FindingLetter1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char key = sc.next().charAt(0);
		boolean found = false;

		for (int i = 0; i < s.length(); i++) {

			char temp = s.charAt(i);

			if (key == temp) {

				found = true;

			}
		}
		if (found) {

			System.out.println("the character " + key + " was found in string " + s);
		} else {

			System.out.println("the character " + key + " was not found in string " + s);

		}
	}
}
