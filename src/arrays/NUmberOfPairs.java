package arrays;

public class NUmberOfPairs {

	public static void main(String[] args) {

		int arr[] = { 11, 25, 64, 64, 15, 15, 22, 25, 76, 84 };

		boolean pairs[] = new boolean[arr.length];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (pairs[i] == false) {
				for (int j = i + 1; j < arr.length; j++) {

					if (arr[i] == arr[j]) {
						pairs[j] = true;
						count++;
						break;
					}

				}
			}

		}
		System.out.println( "the number of pairs occurs " + count);

	}
}
