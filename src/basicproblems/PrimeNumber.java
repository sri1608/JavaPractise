package basicproblems;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter the  value");

		int a = sc.nextInt();
		
		int count = 0;

		for (int i = 1; i <= a; i++) {
			
			if (a % i == 0) {
			
				count++;
			}
		}
		if (count == 2) {

			System.out.println(a + " is a prime number.");

		} else {

			System.out.println(a + " is not an prime number.");

		}

	}

}
