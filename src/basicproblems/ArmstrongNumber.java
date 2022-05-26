package basicproblems;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int numb = sc.nextInt();
		int temp = numb;
		int rem = 0, cube = 0, cubesum = 0;

		while (numb != 0) {

			rem = numb % 10;
			cube = (rem * rem * rem);
			cubesum = cubesum + cube;
			numb = numb / 10;

			System.out.println(rem + " " + cube + " " + cubesum + " " + numb);

		}

		if (cubesum == temp) {

			System.out.println("the given number " + temp + " is an armstrong of " + cubesum);

		} else {

			System.out.println("the given number " + temp + " is  not an armstrong of " + cubesum);
		}
	}
}
