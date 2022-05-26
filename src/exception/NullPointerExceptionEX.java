package exception;

public class NullPointerExceptionEX {

	public static void main(String[] args) {
		String s = null;
		String s1 = "";
		try {
			if (s.equals(s1)) {
				System.out.println("both strings are equal");
			} else {
				System.out.println("both strings are not equal");
			}
		} catch (NullPointerException ex) {
			System.out.println("one of the string has null value");

		}
	}
}
