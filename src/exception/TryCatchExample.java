package exception;

public class TryCatchExample {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int data;

		try {
			data = a / b;

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println(e);

		}

		System.out.println(" rest of the code");
	}
}
