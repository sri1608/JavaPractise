package strings;

import java.util.Scanner;

public final class DifferentCharacters {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int charcount = 0, numcount = 0, splcount = 0;
		
		for (int i = 0; i < s.length(); i++) {
			
		char c = s.charAt(i);
		if((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
			System.out.println(c + " letter ");

			charcount++;
		}else if(c >= 48 && c <= 57) {
			System.out.println(c + " number ");

			numcount++;
		}	
		else {
			System.out.println(c + " special character ");

			splcount++;
		}
	}
		System.out.println("letter count is :- " + charcount);
		System.out.println("numbers count is :- " + numcount);
		System.out.println("lspecial char count is :- " + splcount);

	}
}
