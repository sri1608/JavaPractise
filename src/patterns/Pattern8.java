package patterns;

public class Pattern8 {

	public static void main(String[] args) {
		
		int a = 5;

		for (int i = 0; i < a; i++) {

			for (int j = a; j > 0; j--) {

				System.out.print(a-i + "  ");
			}

			System.out.println();
		}
	}
}
