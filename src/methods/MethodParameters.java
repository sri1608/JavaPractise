package methods;

public class MethodParameters {

	public static void main(String[] args) {

		int a = 25, b = 55;
		addition(a, b);
		System.out.println("The subtraction value of 43, 56 is " + subtraction(43, 56));
		System.out.println("The division value of 43, 5 is " + division(43, 5));
	}

	public static void addition(int a, int b) {
		int c = a + b;
		System.out.println("addition of " + a + " and " + b + " is " + c);
	}

	public static int subtraction(int a, int b) {
		return a - b;

	}
	public static int division(int a, int b) {
		return a / b;
	}
}
