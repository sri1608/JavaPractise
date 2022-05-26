package constructor;

public class HumanTester {

	public static void main(String[] args) {

		Human h = new Human();
		h.setName("subha");
		h.setHeight(163);
		h.setWeight(57.3);
		h.setGender("felame");
		h.setAlive(true);

		Human h1 = new Human();
		h1.setName("heera");
		h1.setHeight(151);
		h1.setWeight(67.3);
		h1.setGender("male");
		h1.setAlive(true);
		
		System.out.println(h);
		System.out.println(h1);

	}

}
