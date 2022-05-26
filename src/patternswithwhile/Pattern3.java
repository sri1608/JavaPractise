package patternswithwhile;

public class Pattern3 {

	public static void main(String[] args) {

		int a = 5;
		int i = 0, j = 0;

		while (i < a) {

			while (j < a - i) {

				System.out.print(" * ");
				j++;
			}

			System.out.println();
			i++;
			j = 0;
		}
	}
}
