package strings;

import java.util.Scanner;

public class SwapingOfFirstAndLastNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] ch = s.toCharArray();
		for(int i = 0; i < ch.length; i++) {
			int a = i;
while(i < ch.length && ch[i] != ' ') {
	i++;
}
char temp = ch[a];
ch[a] = ch[i - 1];
ch[i-1] = temp;

		}
System.out.println(String.valueOf(ch));
	}

}
