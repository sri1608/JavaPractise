package multidimensionalarray;

import java.util.Scanner;

public class DiaonalSumOfMatrix {

	public static void main(String[] args) {

		int a[][] = {{1,2,3}, {2, 3, 4}, {3, 4, 5}};

		int sum = diagonalSum(a);
		System.out.println(" sum of diagomnal elements = " + sum);
	}

	public static int diagonalSum(int[][] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i == j) {
					sum = sum + a[i][j];
				}
			}
		}

		return sum;
	}

}
