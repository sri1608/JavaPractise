package basicproblems;

public class Factorial {

	public static void main(String[] args) {
		
		int a = 5, fact = 1;
	    
		for( int i = a; i > 0; i--) {
			
			fact = fact * i; 
		}
		
		System.out.println(" The factorial of " + a + "! is " + fact);	
	}

}
