package methods;

public class TrimorphicMethod {

	public static void main(String[] args) {
		
		int a = 5;
		int value = trimorphicMethod(a);

		istrimorphic(value, a);
		istrimorphic(23, trimorphicMethod(23));
		istrimorphic(24, trimorphicMethod(24));

	}

	public static void istrimorphic(int value, int number) {

		if (value == number) {

			System.out.println(value + " is a trimorphic number.");

		} else {

			System.out.println(value + " is not a trimorphic number.");
		}
	}
	
	public static int trimorphicMethod(int a) {
	int rev = 0, rem, temp = a * a * a, count = 0;
	
	while (a != 0) {
		 
		a = a / 10;
		count++;
	}

	for(int i = 0; i < count; i++) {
			
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;

		}
		
		while(rev > 0) {
			rem = rev % 10;
			a = a * 10 + rem;
			rev = rev / 10;
		}
return a;
	}

}
