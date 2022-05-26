package methods;

public class FactorialMethod {

	public static void main(String[] args) {

		long a = 5;
		factorial(a);
		factorial(25);
		factorial(55);
		factorial(59);
		factorial(65);
		factorial(88);
	}

	public static void factorial(long a) {
		long fact = 1;

		for (long i = a; i > 0; i--) {

			fact = fact * i;
		}
		System.out.println(" The factorial of " + a + "! is " + fact);
	}
}