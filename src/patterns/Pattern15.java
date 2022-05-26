package patterns;

public class Pattern15 {

	public static void main(String[] args) {

		int a = 4;

		for (int i = a; i >= 0; i--) {

			for (int j = 0; j < a - i; j++) {

				System.out.print("  ");
			}
			for (int j = 0; j < i; j++) {

				System.out.print(i - j + " ");
			}

			System.out.println();
		}
	}
}
