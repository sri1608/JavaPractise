package strings;

import java.util.Scanner;

public class SwapingOfFirstAndLastNumber2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String temp = "" + s.charAt(s.length()-1);
		
	for(int i = 1; i < s.length()-1; i++) {
		
		temp += s.charAt(i);
	}
	
	temp += s.charAt(0);
	
	System.out.println(temp);
	
	}
}
