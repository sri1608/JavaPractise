package patternswithwhile;

public class Pattern1 {

	public static void main(String[] args) {

		int a = 5;
		int i = 0, j = 1;

		while (i <= a) {

			while (j <= a) {

				System.out.print(" * ");
				j++;
			}

			System.out.println();
			i++;
			j = 1;
		}
	}
}
