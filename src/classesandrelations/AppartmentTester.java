package classesandrelations;

import java.util.ArrayList;
import java.util.List;

public class AppartmentTester {

	public static void main(String[] args) {

		AppartmentFlat Bhk1 = new AppartmentFlat(50, "121A", "1bhk");
		AppartmentFlat Bhk2 = new AppartmentFlat(50, "121B", "2bhk");
		AppartmentFlat Bhk3 = new AppartmentFlat(50, "121C", "3bhk");

		List<AppartmentFlat> flat = new ArrayList<>();
		flat.add(Bhk1);
		flat.add(Bhk2);
		flat.add(Bhk3);
		
		List<AppartmentRooms> rooms = new ArrayList<>();
	

Appartment a = new Appartment("sri", flat, rooms);

System.out.println(a);
	}

}
