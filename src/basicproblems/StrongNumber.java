package basicproblems;

public class StrongNumber {

	public static void main(String[] args) {

		int a = 145, sum = 0, rem = 0, fact = 1;

		for (int i = a; i < 0; i++) {
            
			i = i % 10;
			fact = fact * i;
			sum = sum + fact;
			i = i / 10;  

		}
		if (sum == a) {

			System.out.println("The given number " + a + " is a strong number of "+ sum);
			
		}else {
			
			System.out.println("The given number " + a + " is not an strong number of "+ sum);
		}

	}

}
