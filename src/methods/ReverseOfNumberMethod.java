package methods;

public class ReverseOfNumberMethod {

	public static void main(String[] args) {

		int number = 876;
		
		reverseOfNumber(number);
		}

	public static void reverseOfNumber(int number) {
		int rev = 0, rem;
		int temp = number;
		while (number != 0) {
			
		 rem = number % 10;
			rev = (rev * 10) + rem;
			number = number / 10;
			System.out.println(rem + " " + rev + " " + number);

		}
		System.out.println("the reverse value of the given number " + temp + " is " + rev);

	}

}
