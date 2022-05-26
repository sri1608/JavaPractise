package multidimensionalarray;

public class TwoDimensionalArrayEx3 {

	public static void main(String[] args) {

		int[][] a = {{1,2}, {15, 12, 13}, {11, 21, 32, 41, 51}};
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++){
				System.out.println("a[" + i + "][" + j + "] =" + a[i][j] );
	}

}
}}