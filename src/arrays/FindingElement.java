package arrays;

public class FindingElement {

	public static void main(String[] args) {

		int arr[] = { 78, 67, 43, 89, 657, 45, 789, 89 };
		int number = 35;
		boolean find = false;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] == number) {
				
				find = true;
				break;
			}
		}
		
		if (find) {
			
			System.out.println(number + " is found");
			
		} else {
			
			System.out.println(number + " not found");
		}
	}

}
