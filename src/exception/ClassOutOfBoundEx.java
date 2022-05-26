package exception;

public class ClassOutOfBoundEx {

	public static void main(String[] args) {

		int a[] = new int[3];
		for (int num : a) {
			System.out.print(num + " ");
		}

		System.out.println();
		try {
			for (int i = 0; i <= a.length; i++) {
				System.out.println(a[i]);
			}
		} catch (IndexOutOfBoundsException ex) {
			System.out.println(" Index out of bound occurs");

		}

		System.out.println(" Succesfully printed default values 2 times.");
	}

}
