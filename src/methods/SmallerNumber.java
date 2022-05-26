package methods;

import java.util.Scanner;

public class SmallerNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values");
		int a = sc.nextInt();
		int b = sc.nextInt();
		smallerNumber(a, b);
	}

	public static void smallerNumber(int a, int b)
	{
		if (a < b) {

			System.out.println(a + " is lesser than " + b);

		} else {

			System.out.println(b + " is lesser than " + a);
		}
	}
}
