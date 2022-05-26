package classesandrelations;

import java.util.List;

public class Appartment {
	
	private String name;
	private List<AppartmentFlat> flat;
	private  List<AppartmentRooms> rooms;

	public Appartment() {}

	
	public Appartment(String name, List<AppartmentFlat> flat, List<AppartmentRooms> rooms) {
		super();
		this.name = name;
		this.flat = flat;
		this.rooms = rooms;
	}

																																																																
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<AppartmentFlat> getFlat() {
		return flat;
	}


	public void setFlat(List<AppartmentFlat> flat) {
		this.flat = flat;
	}


	public List<AppartmentRooms> getRooms() {
		return rooms;
	}


	public void setRooms(List<AppartmentRooms> rooms) {
		this.rooms = rooms;
	}


	public String toString() {
		return "Appartment [name=" + name + ", flat=" + flat + ", rooms=" + rooms + "]";
	}

}
