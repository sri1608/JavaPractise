package multidimensionalarray;

public class TwoDimensionalArrayEx1 {

	public static void main(String[] args) {

		int a[][] = {{1, 2, 5}, {3, 4, 6} };
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++){
				System.out.println("a[" + i + "][" + j + "] =" + a[i][j] );
			} 
		}
	}

}
