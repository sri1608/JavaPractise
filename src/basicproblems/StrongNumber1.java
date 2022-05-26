package basicproblems;

public class StrongNumber1 {

	public static void main(String[] args) {

		int a = 145, sum = 0 , rem, temp = a;

		while (a > 0) {
			rem = a % 10;
			 int fact = 1;

			for (int i = 1; i <= rem; i++) {

				fact = fact * i;
			}

			sum = sum + fact;
			a = a / 10;

		}
		if (sum == temp ) {

			System.out.println("The given number " + temp + " is a strong number of " + sum);

		} else {

			System.out.println("The given number " + temp + " is not an strong number of " + sum);
		}

	}

}
