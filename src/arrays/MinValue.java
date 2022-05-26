package arrays;

public class MinValue {

	public static void main(String[] args) {
		
		int a[] = {-25, -87, -32, -5};
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < a.length; i++) {
			
			if(a[i] < min) {
			
				min = a[i];
			}
		}
		
		System.out.println(min + " is the lowest value in the array.");

	}

}
