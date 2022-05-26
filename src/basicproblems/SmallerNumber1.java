package basicproblems;

import java.util.Scanner;

public class SmallerNumber1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value");
		int firstvalue = sc.nextInt();
		System.out.println("Enter the second value");
		int secondvalue = sc.nextInt();

		if (firstvalue < secondvalue) {

			System.out.println(firstvalue + " is lesser than " + secondvalue);

		} else {

			System.out.println(secondvalue + " is lesser than " + firstvalue);
		}

	}

}
