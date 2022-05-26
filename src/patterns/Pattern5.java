package patterns;

public class Pattern5 {

	public static void main(String[] args) {

		int a = 4;

		for (int i = a; i >= 0; i--) {

			for (int j = 0; j < i; j++) {

				System.out.print("   ");
			}

			for (int j = 0; j < a - i; j++) {

				System.out.print(" * ");
			}
			
			System.out.println( );
		}
	}
}
