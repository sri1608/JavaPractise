package methods;

public class StrongNumberMethod {

	public static void main(String[] args) {

		int a = 145;
		int value = strongNumber(a);
		isStrongNumber(value, a);
		isStrongNumber(153, strongNumber(153));
	}

	public static void isStrongNumber(int sum, int num) {

		if (sum == num) {

			System.out.println("The given number " + num + " is a strong number of " + sum);

		} else {

			System.out.println("The given number " + num + " is not an strong number of " + sum);
		}
	}

	public static int strongNumber(int a) {

		int sum = 0, rem = 0;

		while (a > 0) {
			rem = a % 10;
			 int fact = 1;

			for (int i = 1; i <= rem; i++) {

				fact = fact * i;
			}

			sum = sum + fact;
			a = a / 10;

		}

		return sum;
	}

}
