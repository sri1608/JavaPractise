package methods;

public class AutomorphicMethod {

	public static void main(String[] args) {

		int a = 25;
		int value = automorphicMethod(a);

		isAutomorphic(value, a);
		isAutomorphic(76, automorphicMethod(76));
		isAutomorphic(87, automorphicMethod(87));

	}

	public static void isAutomorphic(int value, int number) {

		if (value == number) {

			System.out.println(value + " is a automorphic number.");

		} else {

			System.out.println(value + " is not a automorphic number.");
		}
	}

	public static int automorphicMethod(int number) {

		int rev = 0, rem;
		int temp = number * number;

		int count = 0;

		while (number != 0) {
			number = number / 10;
			count++;
		}

		for (int i = count; i > 0; i--) {

			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;

		}

		while (rev > 0) {
			rem = rev % 10;
			number = number * 10 + rem;
			rev = rev / 10;
		}
		return number;

	}
}
