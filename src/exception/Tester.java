package exception;

public class Tester {

	public static void main(String[] args) {

		try {
			String s = "subha is a dependent";

			if (s.length() > 10) {

				throw new StringLengthExceed(s + " - has more than 10 characters");
			}

		} catch (StringLengthExceed ex) {

			System.out.println(ex);
		}

	}
}
