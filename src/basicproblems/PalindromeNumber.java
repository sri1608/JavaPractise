package basicproblems;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int number = sc.nextInt();
		int temp = number;
		int rev = 0, rem;
		
		while(number != 0) {
			
			 rem = number % 10;
			 rev = (rev * 10) + rem;
			 number = number / 10;
			 
			 System.out.println(rem + " " + rev + " " + number);
			 
		}
		if(rev == temp) {
			
			System.out.println( "The obtained value " + rev + " of given no is a palindrome");
			
		}
		 else {
			
			System.out.println( "The obtained value " + rev + " of given no is  not a palindrome");
		}
	}

}
