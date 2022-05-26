package arrays;

import java.util.Scanner;

public class ExcludingValue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i]=sc.nextInt();	
		}
		int k=sc.nextInt();
		for(int i=0;i<n-1;i++)
		{
			if(a[i]==k)
			{
				System.out.print("1");
				break;
			}
		}
		
	}

}
