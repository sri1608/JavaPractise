package collections;

public class ArrayListExampleDuplicate {

	public static void main(String[] args) {
		int arr[] = { 12, 23, 34, 56, 12, 34, 56, 23, 12, 67 };
		boolean b[] = new boolean[arr.length];

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					b[j] = true;

				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (b[i] == false) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
