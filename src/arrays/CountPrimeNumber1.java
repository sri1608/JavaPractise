package arrays;

import java.util.Scanner;

public class CountPrimeNumber1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values");
		int n = sc.nextInt();
		int a[] = new int[n];
				
				int count = 0;

	for(int i = 0; i<a.length;i++) {
		if(isPrime(a[i])) 
			count++;
		}
	System.out.println("The prime numbers in array are " + count);
	}
	
	public static boolean isPrime(int n) {
		if(n <= 1) {
			return false;
		
		}
		for(int i = 2; i< n/2; i++) {
			if (n % i == 0) {
				return false;
			}
			
		}
		return true;
	}

}
	

