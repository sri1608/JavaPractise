package arrays;

public class Typesofarrays {

	public static void main(String[] args) {
		
		int intArray[] = {10, 20, 30, 40, 50};
		double douArray[] = {10.235, 20.56, 30.789, 40.678, 50.678};
		char charArray[] = {'s', 'a', 'n', 'g', 'r', 'a', 'm'};
		boolean bolArray[] = { true, false, true, false, true};

	
	System.out.println("Integer array :-");
	for (int i = 0; i < intArray.length; i++) {
		System.out.print("intArray[" + i + "] = " + intArray[i] + ",  ");

}
	System.out.println("\n\nDouble array :-");
	for (int i = 0; i < douArray.length; i++) {
		System.out.print("douArray[" + i + "] = " + douArray[i] + ",  ");

}
	System.out.println("\n\nCharacter array :-");
	for (int i = 0; i < charArray.length; i++) {
		System.out.print("charArray[" + i + "] = " + charArray[i] + ",  ");

}
	System.out.println("\n\nBoolean array :-");
	for (int i = 0; i < bolArray.length; i++) {
		System.out.print("bolArray[" + i + "] = " + bolArray[i] + ",  ");

}
	
	}
	}