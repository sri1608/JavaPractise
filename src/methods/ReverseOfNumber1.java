package methods;

public class ReverseOfNumber1 {

	public static void main(String[] args) {

		int number = 876;
		int temp = number;
		int reverse = reverseOfNumber(number);
		System.out.println("the reverse value of the given number " + temp + " is " + reverse);

	}

	public static int reverseOfNumber(int number) {

		int rev = 0, rem;
		
		while (number != 0) {
			rem = number % 10;
			rev = (rev * 10) + rem;
			number = number / 10;
			System.out.println(rem + " " + rev + " " + number);

		}
		return rev;
	}

}
