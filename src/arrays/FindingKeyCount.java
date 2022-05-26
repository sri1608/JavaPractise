package arrays;

public class FindingKeyCount {

	public static void main(String[] args) {
		
		int arr[] = {34, 56, 665, 67, 75, 56, 554, 567};
		int count = 0, number = 56;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] == number) {
				
				count++;
			}
		}
	System.out.println( number + " was found " + count + " times.");
	}
}
