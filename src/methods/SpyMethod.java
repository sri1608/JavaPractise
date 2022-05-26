package methods;

public class SpyMethod {

	public static void main(String[] args) {

		int a = 158;

		 spyNumber(a);
		 spyNumber(1124);
		 spyNumber(1234);
	}
	

	public static void spyNumber(int num) {
		int sum = 0, product = 1, rem;

		while (num != 0) {

			rem = num % 10;
			sum = sum + rem;
			product = product * rem;
			num = num / 10;

			//System.out.println(rem + " " + sum + " " + product + " " + num);
		}
		if (sum == product) {

			System.out.println("The given number is an spy number");

		} else {

			System.out.println("The given number is not an spy number ");

		}
		}
	}