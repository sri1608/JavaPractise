package classesandrelations;

public class AppartmentRooms {
	
	private int numberofrooms;
	
	public AppartmentRooms() {}

	public AppartmentRooms(int numberofrooms) {
		this.numberofrooms = numberofrooms;
	}

	public int getNumberofrooms() {
		return numberofrooms;
	}

	public void setNumberofrooms(int numberofrooms) {
		this.numberofrooms = numberofrooms;
	}

	public String toString() {
		return "AppartmentRooms [numberofrooms=" + numberofrooms + "]";
	}
	
}
