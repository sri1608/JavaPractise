package patterns;

public class Pattern12 {

	public static void main(String[] args) {

		int a = 5;

		for (int i = 0; i < a; i++) {

			for (int j = 1; j <= a - i; j++) {

				System.out.print(j + " ");
			}

			System.out.println();
		}

	}

}
