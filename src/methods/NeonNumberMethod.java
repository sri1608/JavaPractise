package methods;

import java.util.Scanner;

public class NeonNumberMethod {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the value");

		int num = sc.nextInt();
		int sum =  neonNumber(num);

		isNeon(sum, num);

	}

	public static void isNeon(int sum, int num) {
		
		if(sum == num) {
			System.out.println("the given number"+ num+" is an neon number of"+ sum);
			
		}else {
			System.out.println("the given number"+ num+" is not an neon number of"+ sum);

			
		}
		
	}

	public static int neonNumber(int num) {
		
		int rem = 0, sum = 0, square = 0;

square = num * num;

		while (square != 0) {

			rem = square % 10;
			sum += rem;
			square /= 10;

			//System.out.println(rem + " " + sum + " " + num);

		}	
		return sum;
	}
}
