package arrays;

public class CountPrimeNumbers {

	public static void main(String[] args) {

		int a[] = { 11, 12, 13, 56, 87, 99 };

		for (int i = 0; i < a.length; i++) {
			int c = 2;
			
			for (int j = 2; j <= Math.sqrt(a[i]); j++) {
				
				if (a[i] % j == 0) {
					
					c++;
				}
			}
			
			if (c == 2) {
				
				System.out.println(a[i]);
			}
		}
	}
}
