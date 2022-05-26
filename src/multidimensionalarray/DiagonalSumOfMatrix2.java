package multidimensionalarray;

public class DiagonalSumOfMatrix2 {

	public static void main(String[] args) {
// in this example we are displaying the values in diagonal position
		
		int sum = 0;
		int a[][] = { { 1, 2, 3 }, { 2, 3, 4 }, { 3, 4, 5 } };
		for (int i = 0; i < a.length; i++) {
			System.out.println("The matrix item at" + i+ " ," + i+ "position = " + a[i][i]);
			// we can use format in place of println("\n) has to mention at the starting
			sum = sum + a[i][i];
		}
		System.out.println(sum);
	}

}
