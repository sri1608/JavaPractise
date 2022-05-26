package objectsandclasses;

public class Tester2 {

	public static void main(String[] args) {
		
		House h = new House();
		h.Doorno = "54A";
		h.stairs = 1;
		h.Streetname = "allwyn";
		h.noofrooms = 2;
		h.squarefeet = 123.4;
		
		House h1 = new House();
		h1.Doorno = "54A12";
		h1.stairs = 2;
		h1.Streetname = "Indirareddyallwyn";
		h1.noofrooms = 4;
		h1.squarefeet = 340.4;
		
		System.out.println("Entering the house details :");
		System.out.println();
		System.out.println("Entering the first house details :");
		System.out.println(h.Doorno + ", " + h.stairs + ", " + h.Streetname + ", " + h.noofrooms + ", " + h.squarefeet);
		System.out.println();
		System.out.println("Entering the first house details :");
		System.out.println(h1.Doorno + ", " + h1.stairs + ", " + h1.Streetname + ", " + h1.noofrooms + ", " + h1.squarefeet);
	}

}
