package basicproblems;

import java.util.Scanner;

public class Factorial1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value");
		
		int a = sc.nextInt();
		int i = a, fact = 1;

		while (i > 0) {

			fact = fact * i;
			
			i--;
		}

		System.out.println( fact + " is the factorial of " + a + "!  ");

	}

}
