package basicproblems;

import java.util.Scanner;

public class ReverseOfNumber1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the velue");
		int num = sc.nextInt();
		int rev = 0, rem = 0;

		while (num != 0) {

			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}

		System.out.println("Reverse value of the number is " + rev);

	}

}
