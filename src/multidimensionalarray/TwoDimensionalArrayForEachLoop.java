package multidimensionalarray;

public class TwoDimensionalArrayForEachLoop {

	public static void main(String[] args) {
		int[][] a = {{1,2}, {15, 12, 13}, {11, 21, 32, 41, 51}};
		for(int[] first : a) {
			for(int ending : first) {
				System.out.println( ending );
			}
			
		}

	}

}
