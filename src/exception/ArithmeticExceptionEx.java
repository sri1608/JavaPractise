package exception;

public class ArithmeticExceptionEx {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;
		int c = 0;

		try {
			c = a / b;

		} catch (ArithmeticException ex) {
			System.out.println("divided by zero is " + c);
		}
	}

}
