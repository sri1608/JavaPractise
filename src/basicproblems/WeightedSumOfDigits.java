 package basicproblems;

public class WeightedSumOfDigits {

	public static void main(String[] args) {

		int a = 123;
		int count = 0, sum = 0, temp = a, rem;

		while (temp > 0) {

			count++;
		    temp = temp / 10;

		}
		while (a > 0) {

			rem = a % 10;
			sum += (rem * count);
			a = a / 10;
			count--;

		}

		System.out.println(sum);

	}

}
