package multidimensionalarray;

public class TwoDimensionalArrayEx {

	public static void main(String[] args) {

		int a[][] = new int[5][6];
		a[0][5] = 56;
		a[3][2] = 6;		
		a[1][4] = 5;
        a[4][5] = 99;
System.out.println("arr [0][5] = " + a[0][5] + ", " + "a[3][2] = " + a[3][2] + "; " 
		+ "a[1][4] = " + a[1][4] + "; " +  " a[4][5] = " + a[4][5] );
	}

}
