package patterns;

public class Pattern14 {

	public static void main(String[] args) {

		int a = 5;

		for (int i = 1; i <= a; i++) {

			for (int j = 0; j < i; j++) {

				System.out.print(a-j + " ");
			}
			
			System.out.println();
		}
	}
}
