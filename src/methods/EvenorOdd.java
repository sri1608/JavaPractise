package methods;

public class EvenorOdd {

	public static void main(String[] args) {

		evenOdd(45);
		evenOdd(4);
		evenOdd(37);
		evenOdd(88);
	}

	public static void evenOdd(int number) {
		
		if (number % 2 == 0) {
			
			System.out.println(number + " is an even number.");
			
		} else {
			
			System.out.println(number + " is an odd number.");
		}
	}
}
