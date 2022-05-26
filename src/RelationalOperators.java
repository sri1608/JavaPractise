
public class RelationalOperators {

	public static void main(String[] args) {
		
		int a = 44, b = 54 , c = 42, d = 74, e = 87, f = 42;
		
		boolean bb = c > e;
		boolean bb1 = d < a;
		boolean bb2 = a == c;
		boolean bb3 = b != d;
		boolean bb4 = c == f;
		
		System.out.println(" 42 > 87 -> 42 is not greater than 87 so it is " + bb);
		System.out.println(" 74 < 44 -> 74 is not less than 44 so it is " + bb1);
		System.out.println(" 44 == 87 -> 44 is not equal to 87 so it is " + bb2);
		System.out.println(" 42 != 74 -> 42 is not equal to 74 so it is " + bb3);
		System.out.println(" 42 == 42 -> 42 is equal to 42 so it is " + bb4);

	    System.out.println(bb);
	    System.out.println(bb1);
	    System.out.println(bb2);
	    System.out.println(bb3);
	    System.out.println(bb4);
	    

	}

}






