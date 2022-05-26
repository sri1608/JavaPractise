package methods;

public class PrefectNumberMethod {

	public static void main(String[] args) {
		int a = 496;

		perfectNumber(a);
		perfectNumber(543);
		perfectNumber(987);

	}

	public static void perfectNumber(int a) {
		int sum = 1;
		for (int i = 2; i <= a / 2; i++) {

			if (a % i == 0) {

				sum = sum + i;
			}
		}
		
		if (sum == a) {

			System.out.println("The given number is a perfect number ");

		} else {

			System.out.println("The given number is not perfect number");

		}
	}

}
