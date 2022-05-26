package arrays;

public class MaxValue {

	public static void main(String[] args) {
		
		int a[] = {13, 24, 35, 98, 45, 76, 99, 34};
		int max = a[0];
		
		for(int i = 0; i < a.length; i++) {
		
			if(a[i] > max) {
			
				max = a[i];
			}
		}
		
		System.out.println(max + " is the hightest value in the array.");
	}
}
