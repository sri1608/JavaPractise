package exception;

public class MultiCatchBlockEx {

	public static void main(String[] args) {

		try {
			int a[] = new int[5];
			System.out.println(a[10]);
			
		}catch(ArithmeticException e) {
			
			System.out.println("Arithmetic Exception occurs");
			
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println(" ArrayIndexOutOfBoundsException occurs");

		}catch(Exception e) {
			
			System.out.println(" parent exception occurs");

		}
		
		System.out.println("rest of code");
	}

}
