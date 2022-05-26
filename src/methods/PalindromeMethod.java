package methods;

public class PalindromeMethod {

	public static void main(String[] args) {

		int number = 15651;
		int rev = reverseOfNumber(number);
		isAPalindrome(number, rev);
		
		isAPalindrome(22322, reverseOfNumber(22322));
		
		int number2 = 1234;
		int number2Reverse = reverseOfNumber(number2);
		isAPalindrome(number2, number2Reverse);

	}

	/*
	 * int a = 10;
	 * int b = a;
	 */
	public static void isAPalindrome(int n, int reverse) {

		if (n == reverse) {

			System.out.println("The obtained value " + reverse + " of given number is a palindrome");

		} else {

			System.out.println("The obtained value " + reverse + " of given number is not a palindrome");

		}

	}

	public static int reverseOfNumber(int num) {

		int rev = 0, rem;

		while (num != 0) {

			rem = num % 10;
			rev = (rev * 10) + rem;
			num = num / 10;
			//System.out.println(rem + " " + rev + " " + number);
		}
		return rev;
	}
}
