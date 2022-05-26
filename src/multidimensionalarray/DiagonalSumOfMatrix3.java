package multidimensionalarray;

import java.util.Scanner;

public class DiagonalSumOfMatrix3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("\n enter the rows and columns");
		int row, column, sum = 0;
		row = sc.nextInt();
		column = sc.nextInt();
		int a[][] = new int[row][column];
		System.out.println("\n enter the items");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println("The matrix item at" + i + " ," + i + "position = " + a[i][i]);
			sum = sum + a[i][i];
		}
		System.out.println(sum);
	}
}
