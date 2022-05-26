package methods;

public class MethodOverloading {

	public static void main(String[] args) {

		addition(76, 789);
		addition(654.56, 436.6);
		addition(763, 789, 876);

	}

	public static void addition(int a, int b) {
		System.out.println(a + b);
	}

	public static void addition(double a, double b) {
		System.out.println(a + b);
	}

	public static void addition(int c, int d, int e) {
		System.out.println(c + d + e);
	}
}
