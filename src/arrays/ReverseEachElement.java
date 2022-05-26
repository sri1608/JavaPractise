package arrays;

public class ReverseEachElement {

	public static void main(String[] args) {
		int a[] = { 74, 65, 89, 45, 32 };

		int rev = 0, rem;

		for (int i = 0; i < a.length; i++) {
			int n = a[i];
			while (n != 0) {

				rem = n % 10;
				rev = (rev * 10) + rem;
				n = n / 10;
				
				System.out.print(rev);
			}
		}
	}
}