package arrays;

import java.util.Scanner;

public class SuperArray {

	public static void main(String[] args) {

		int arr[] = { 65, 17, 15, 29, 16, 4, 5 };
		int number = 10;
		boolean b = false;
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i + 1; j < arr.length; j++) {
				
				if (arr[i] + arr[j] == number) {
					
					b = true;
					break;
				}
			}
			
			if (b) {
				
				break;
			}
		}
		
		if (b) {
			
			System.out.println("It is an super array");

		} 
		else {
		
			System.out.println("It is not an super array");

		}
	}
}
