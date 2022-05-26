package basicproblems;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the value");

		int num = sc.nextInt();
		int sum = 0, product = 1, rem;
		int temp = num;

		while (num != 0) {

			rem = num % 10;
			sum = sum + rem;
			product = product * rem;
			num = num / 10;

			System.out.println(rem + " " + sum + " " + product + " " + num);

		}
		if (sum == product) {

			System.out.println("The given number " + temp + " is an spy number");

		} else {

			System.out.println("The given number " + temp + " is not an spy number ");

		}
	}

}
