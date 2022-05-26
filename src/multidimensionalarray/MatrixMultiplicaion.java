package multidimensionalarray;

import java.util.Scanner;

public class MatrixMultiplicaion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		System.out.println("enter the first matrix values :- ");
		for (int i = 0; i < a.length; i++) {
			System.out.println("enter " + (i + 1) + " rows");
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = sc.nextInt();

			}
		}
		System.out.println("enter the second matrix values :- ");
		for (int i = 0; i < b.length; i++) {
			System.out.println("enter " + (i + 1) + " rows");
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = sc.nextInt();

			}
		}
		int c[][] = new int[3][3];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				c[i][j] = a[i][j] * b[i][j];

			}
		}
		System.out.println("The  matrix multiplication :-");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

	}
}
