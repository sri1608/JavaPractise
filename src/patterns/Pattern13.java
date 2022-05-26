package patterns;

public class Pattern13 {

	public static void main(String[] args) {

		int a = 4;

		for (int i = 1; i <= a; i++) {

			for (int j = 0; j < a - i; j++) {

				System.out.print("  ");
			}

			for (int j = 0; j < i; j++) {

				System.out.print(j + 1 + " ");
			}

			System.out.println();
		}
	}
}
