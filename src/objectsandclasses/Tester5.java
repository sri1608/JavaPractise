package objectsandclasses;

public class Tester5 {

	public static void main(String[] args) {

		City c = new City();
		c.name = "Hyderabad";
		c.state = "Telangana";
		c.Country = "India";
		c.population = 5734655.56;
		
		City c1 = new City();
		c1.name = "wuhan";
		c1.state = "shangai";
		c1.Country = "china";
		c1.population = 3446546;
		
		City c2 = new City();
		c2.name = "vizag";
		c2.state = "Andra pradesh";
		c2.Country = "India";
		c2.population = 234367.67;
		
		City c3 = new City();
		c3.name = "tirupathi";
		c3.state = "Telangana";
		c3.Country = "India";
		c3.population = 2346767.4;
		
		City c4 = new City();
		c4.name = "nalgonda";
		c4.state = "Telangana";
		c4.Country = "India";
		c4.population = 76787.4;
		
		System.out.println("Entering the city details :");
		System.out.println();
		System.out.println("Entering the first city details :");
		System.out.println(c.name + ", " + c.state + ", " + c.Country + ", "+ c.population);
		System.out.println();
		System.out.println("Entering the second city details :");
		System.out.println(c1.name + ", " + c1.state + ", " + c1.Country + ", "+ c1.population);
		System.out.println();
		System.out.println("Entering the third city details :");
		System.out.println(c2.name + ", " + c2.state + ", " + c2.Country + ", "+ c2.population);
		System.out.println();
		System.out.println("Entering the fourth city details :");
		System.out.println(c3.name + ", " + c3.state + ", " + c3.Country + ", "+ c3.population);
		System.out.println();
		System.out.println("Entering the fifth city details :");
		System.out.println(c4.name + ", " + c4.state + ", " + c4.Country + ", "+ c4.population);


		

	}

}
