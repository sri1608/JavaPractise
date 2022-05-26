package statickeywords;

public class Tester {

	public static void main(String[] args) {
		// from same class we can call static method directly
		Addition.add(11.23, 12.34);

		// for non static we have to create an object to call the method
		Addition a = new Addition();
		a.add(12, 55);

	}
}
