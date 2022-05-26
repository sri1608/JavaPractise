package basicproblems;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the value");

		int num = sc.nextInt();
		int temp = num;
		int rem = 0, sum = 0;

		num = num * num;

		while (num != 0) {

			rem = num % 10;
			sum = sum + rem;
			num = num / 10;

			System.out.println(rem + " " + sum + " " + num);

		}
		if (sum == temp) {

			System.out.println("The given no " + temp + " is an neon number ");

		} else {

			System.out.println("The given no " + temp + " is not an neon number ");

		}
	}

}
