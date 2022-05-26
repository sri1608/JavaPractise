package basicproblems;

import java.util.Scanner;

public class PronicNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value");

		boolean flag = false;
		int a = sc.nextInt();
		int temp = a;

		for (int i = 1; i < a; i++) {

			temp = i * (i + 1);
			
			System.out.println(temp + " = " + i + " * " + (i + 1));
			
			if(temp == a) {
				flag = true;
				break;
			}

		}

		if (flag){
			
			System.out.println(a + " is a pronic number");

		} else {

			System.out.println(a + " is not a pronic number");

		}

	}

}
