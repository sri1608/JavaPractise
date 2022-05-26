package arrays;

public class ReverseOfArray {

	public static void main(String[] args) {
		
		int a[] = {5, 8, 9, 8, 65, 34};
		
		for(int i = a.length-1; i >= 0; i--) {
			
			System.out.print(a[i] + " ; ");
		}
		
	}
}
