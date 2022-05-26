package exception;

public class NUmberFormatEx {
	
	public static void main(String Args[]) {
	
		int num = Integer.parseInt("123");
	double d = Double.parseDouble("123.32");
	int num1 = 0;

	try {
	 num1 = Integer.parseInt("a1");
	}catch(NumberFormatException ex) {
		System.out.println("number is invaild");

	}
	System.out.println(num);
	System.out.println(d);
	System.out.println(num1);
	}
	
}
