package strings;

import java.util.Scanner;

public class SwapingOfFirstAndLastNumber1 {

	public String testMethod() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int length = s.length();
		if(length <= 1) {
			return s;
		}
		return s.charAt(length - 1) + s.substring(1, length - 1) + s.charAt(0);
	}

}
