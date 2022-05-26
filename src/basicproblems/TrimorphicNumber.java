package basicproblems;

import java.util.Scanner;

public class TrimorphicNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value");
		
		int a = sc.nextInt();
		int rev = 0, rem, temp = a * a * a, temp2 = a, count = 0;
		
		while (temp2 != 0) {
			 
			temp2 = temp2 / 10;
			count++;
		}
 
		for(int i = 0; i < count; i++) {
				
				rem = temp % 10;
				rev = rev * 10 + rem;
				temp = temp / 10;

			}
			
			while(rev > 0) {
				rem = rev % 10;
				temp2 = temp2 * 10 + rem;
				rev = rev / 10;
			
				System.out.println(temp2);
			}
			
		    if (temp2 == a ) {
		    	
		    	System.out.println(temp2 + " is a trimorphic number.");
		    	
		    } else {
		    	
		    	System.out.println(temp2 + " is not a trimorphic number.");
		    } 
		}
	}


