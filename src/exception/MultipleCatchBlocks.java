package exception;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		
		try {
			
			int n = Integer.parseInt("a12");
			
		} catch (ArithmeticException a) {
			
			System.out.println("Arthimetic exception occur");

		} catch (Exception ex) {
			
			System.out.println("some other exception occurs");
		}
	}
}
