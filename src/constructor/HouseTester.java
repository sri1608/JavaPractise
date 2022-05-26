package constructor;

public class HouseTester {

	public static void main(String[] args) {

		House h = new House();
		h.setDoorno("54A");
		h.setStairs(1);
		h.setStreetname("allwyn");
		h.setNoofrooms(2);
		h.setSquarefeet(123.4);
		
		House h1 = new House();
		h1.setDoorno("54A12");
		h1.setStairs(2);
		h1.setStreetname("Indirareddyallwyn");
		h1.setNoofrooms(4);
		h1.setSquarefeet(340.4);
		System.out.println(h);
		System.out.println(h1);

	}

}
