package arrays;

public class MaxValue1 {

	public static void main(String[] args) {
		
		int a[] = {-25, -87, -32, -5};
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < a.length; i++) {
			
			if(a[i] > max) {
			
				max = a[i];
			}
		}
		
		System.out.println(max + " is the hightest value in the array.");

	}

}
