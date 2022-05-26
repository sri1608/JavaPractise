package basicproblems;

public class MorphicNumber {

	public static void main(String[] args) {
		 
		int number = 25;
		int rev = 0, rem;
		int temp = number * number;

		int temp2 = number;
		int count = 0;
		
		while(temp2 != 0) {
			temp2 = temp2/10;
			count++;
		}
		
		//625 -> 52
		for(int i = count; i > 0; i--) {
			
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;

		}
		
		while(rev > 0) {
			rem = rev % 10;
			temp2 = temp2 * 10 + rem;
			rev = rev / 10;
		
			System.out.println(temp2);
		}
		
	    if (temp2 == number ) {
	    	
	    	System.out.println(temp2 + " is a automorphic number.");
	    	
	    } else {
	    	
	    	System.out.println(temp2 + " is not a automorphic number.");
	    }
	}
}
