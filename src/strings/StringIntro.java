package strings;

import java.util.Scanner;

public class StringIntro {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
	
		String s = sc.nextLine();
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			System.out.println("character " + i + " = " + c );
	}
		}

}
