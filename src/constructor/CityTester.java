package constructor;

public class CityTester {

	public static void main(String[] args) {

		City c = new City();
		c.setName("Hyderabad");
		c.setState("Telangana");
		c.setCountry("India");
		c.setPopulation(5734655.56);
		
		City c1 = new City();
		c1.setName("wuhan");
		c1.setState("shangai");
		c1.setCountry("china");
		c1.setPopulation(3446546);
		
		City c2 = new City();
		c2.setName("vizag");
		c2.setState("Andra pradesh");
		c2.setCountry("India");
		c2.setPopulation(234367.67);
		
		City c3 = new City();
		c3.setName("tirupathi");
		c3.setState("Telangana");
		c3.setCountry("India");
		c3.setPopulation(2346767.4);
		
		City c4 = new City();
		c4.setName("nalgonda");
		c4.setState("Telangana");
		c4.setCountry("India");
		c4.setPopulation(76787.4);
		
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);

	}

}
