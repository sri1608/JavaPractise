package objectsandclasses;

public class Tester3 {

	public static void main(String[] args) {
		
		Human h = new Human();
		h.name = "subha";
		h.height = 163;
		h.weight = 57.3;
		h.gender = "felame";
		h.alive = true;
		
		Human h1 = new Human();
		h1.name = "heera";
		h1.height = 151;
		h1.weight = 67.3;
		h1.gender = "male";
		h1.alive = true;
		
		System.out.println("Entering the human details :");
		System.out.println();
		System.out.println("Entering the first human details :");
		System.out.println(h.name + ", " + h.height + ", " + h.weight + ", " + h.gender + "," + h.alive);
		System.out.println();
		System.out.println("Entering the first house details :");
		System.out.println(h1.name + ", " + h1.height + ", " + h1.weight + ", " + h1.gender + "," + h1.alive);

	}

}
