
public class ForLoop {

	public static void main(String[] args) {

		for (int a = 2; a <= 5; a++) {

			System.out.println(a);

		}

		for (int b = 15; b >= 10; b--) {

			System.out.println(b);
		}

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print("* ");
			}

			System.out.println();
		}

		for (int a = 1; a <= 8; a++) {

			for (int b = 1; b <= 8; b++) {

				System.out.println(a + " " + b);

			}
		}
	}
}
