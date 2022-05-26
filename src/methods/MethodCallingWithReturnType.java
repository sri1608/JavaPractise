package methods;

public class MethodCallingWithReturnType {

	public static void main(String[] args) {

		int aa = getIntegerData();

		System.out.println("The value is " + aa);

		double d = getDoubleData();
		
		System.out.println("the value is " + d);
	}
	public static int getIntegerData() {
		int a = 10;
		return a;
	}
	public static double getDoubleData() {
		
		double d = 11.23;
		return d;
	}
}
