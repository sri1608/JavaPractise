package arrays;

public class ReverseOfArray1 {

	public static void main(String[] args) {
		
		int a[] = {64, 57, 87, 25, 75, 86};
		int temp[] = new int[a.length];
		
		for(int i = a.length-1, j = 0; i >= 0; i-- , j++) {
			temp[j] = a[i];
		}
		for(int i = 0; i < a.length; i++) {
			System.out.print(temp[i] + ", ");
		}

	}

}
