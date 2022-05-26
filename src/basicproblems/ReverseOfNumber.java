package basicproblems;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value");

		int number = sc.nextInt();
		int rev = 0, rem;
		int temp = number;

		while (number != 0) {

			rem = number % 10;
			rev = (rev * 10) + rem;
			number = number / 10;

			System.out.println(rem + " " + rev + " " + number);
		}

		System.out.println("the reverse value of the given number " + temp + " is " + rev + ".");

	}

}
