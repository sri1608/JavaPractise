package managmentsystemappartment;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {

		AppartmentHelper appartmenthelper = new AppartmentHelper();
		FlatHelper flathelper = new FlatHelper();
		RoomHelper roomhelper = new RoomHelper();
		
		Room r1 = new Room(1, "hall", 10);
		Room r2 = new Room(2, "hall", 12);
		Room r3 = new Room(3, "hall", 15);
		Room r4 = new Room(4, "bedroom1", 5);
		Room r5 = new Room(5, "bedroom1", 7);
		Room r6 = new Room(6, "bedroom1", 10);
		Room r7 = new Room(7, "kitchen", 10);
		Room r8 = new Room(8, "hall", 12);
		Room r9 = new Room(9, "hall", 15);
		Room r10 = new Room(10, "bedroom2", 5);
		Room r11 = new Room(11, "bedroom2", 7);
		Room r12 = new Room(12, "bedroom2", 10);

		ArrayList<Room> double15Bedroom = new ArrayList<>();
		double15Bedroom.add(r3);
		double15Bedroom.add(r6);
		double15Bedroom.add(r9);
		double15Bedroom.add(r12);
		
		ArrayList<Room> single10Bedroom = new ArrayList<>();
		single10Bedroom.add(r1);
		single10Bedroom.add(r4);
		single10Bedroom.add(r7);
		
Flat double15BedroomFlat = new Flat(101, 1, "subha", 45,double15Bedroom);
Flat single10BedroomFlat = new Flat(101, 2, "subha", 20,single10Bedroom);

ArrayList<Flat> flats = new ArrayList<>();
flats.add(single10BedroomFlat);
flats.add(double15BedroomFlat);
Appartment apt = new Appartment("sri", "1A", 2, 90, flats);

System.out.println(apt);




		
	}

}
