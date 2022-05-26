package methods;

import java.util.Scanner;

public class ArmstrrongMethod {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int number = sc.nextInt();
		int cubesum = armstrongOfNumber(number);

		if (isArmstrong(number, cubesum)) {

			System.out.println("the given number " + number + " is an armstrong of " + cubesum);

		} else {

			System.out.println("the given number " + number + " is  not an armstrong of " + cubesum);
		}
	}

	public static boolean isArmstrong(int number, int cubesum) {
		return number == cubesum;

	}

	public static int armstrongOfNumber(int number) {

		int rem = 0, cube = 0, cubesum = 0;

		while (number != 0) {

			rem = number % 10;
			cube = (rem * rem * rem);
			cubesum = cubesum + cube;
			number = number / 10;

			System.out.println(rem + " " + cube + " " + cubesum + " " + number);

		}
		return cubesum;
	}

}
