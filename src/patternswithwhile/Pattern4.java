package patternswithwhile;

public class Pattern4 {

	public static void main(String[] args) {

		int a = 5;
		int i = 0;

		while (i <= a) {

			int j = 0;
			while(j < i) {
				System.out.print("   ");
				j++;
			}
				
			j = 0;
			while(j < a - i) {
				System.out.print(" * ");
				j++;
			}
			i++;
			System.out.println( );
		}
		
	}

}
