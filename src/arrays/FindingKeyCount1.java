package arrays;

public class FindingKeyCount1 {

	public static void main(String[] args) {

		int arr[] = { 34, 56, 665, 67, 75, 56, 554, 567 };
		int count = 0, number = 665;
		boolean b = false;
		
		for(int i = 0; i < arr.length; i++) {

			if (arr[i] == number) {
				b = true;
				count++;
			}
		}
		
		if(b) {

			System.out.println(number + " was found " + count + " times.");
		}
		else {
			
			System.out.println(number + " was not found " + count + " times.");
		}
	}
}