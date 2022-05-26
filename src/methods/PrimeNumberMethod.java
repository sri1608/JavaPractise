package methods;

import java.util.Scanner;

public class PrimeNumberMethod {
		
		
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value");
 int a = sc.nextInt();
 int aa = sc.nextInt();
 int aaa = sc.nextInt();

	primeMethod(a);
	primeMethod(aa);
	primeMethod(aaa);
	
}
	public static void primeMethod(int a) {
		
		int count = 0;

		for (int i = 2; i <= a; i++) {
			
			if (a % i == 0) {
			
				count++;
			}
		}
		if (count == 1) {

			System.out.println(a + " is a prime number.");

		} else {

			System.out.println(a + " is not an prime number.");

		}

	}

	}


