package statickeywords;

public class Addition {
	//non static method
	public void add(int a, int b) {
		int c = a + b;
		System.out.println("The addition of " + a + " and " + b + " = " + c);
		
	}
//static method
	public static void add (double a, double b) {
		double d = a + b;
		System.out.println("The addition of " + a + " and " + b + " = " + d);
	}		
}
