package methods;

public class WeightedSumMethod {

	public static void main(String[] args) {
		

		int a = 123;
		weightedSum(a);
		weightedSum(6524);
		weightedSum(765);
	}
	public static void weightedSum(int a) {
		
		int count = 0, sum = 0,  temp = a, rem;

		while (temp > 0) {

			count++;
		    temp = temp / 10;

		}
		while (a > 0) {

			rem = a % 10;
			sum += (rem * count);
			a /= 10;
			count--;
		}
		System.out.println(sum);
	}

}
