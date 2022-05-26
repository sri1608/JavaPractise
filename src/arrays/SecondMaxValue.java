package arrays;

public class SecondMaxValue {

	public static void main(String[] args) {

		int a[] = { 87, 9, 98, 78, 54, 57, 89 };
		int max = Integer.MIN_VALUE;
		int secondmax = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {

			if (a[i] > max) {
				secondmax = max;
				max = a[i];
			}
		}

		System.out.println(secondmax);

	}

}
