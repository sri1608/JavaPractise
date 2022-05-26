package managmentsystemappartment;

import java.util.List;

public class Flat {

	private int flatnumber;
	private int floor;
	private String ownername;
	private double sqfts;
	private List<Room> rooms;
	
	public Flat() {}

	public Flat(int flatnumber, int floor, String ownername, double sqfts, List<Room> rooms) {
		this.flatnumber = flatnumber;
		this.floor = floor;
		this.ownername = ownername;
		this.sqfts = sqfts;
		this.rooms = rooms;
	}

	public int getFlatnumber() {
		return flatnumber;
	}

	public void setFlatnumber(int flatnumber) {
		this.flatnumber = flatnumber;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public String getOwnername() {
		return ownername;
	}

	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}

	public double getSqfts() {
		return sqfts;
	}

	public void setSqfts(double sqfts) {
		this.sqfts = sqfts;
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	public String toString() {
		return "Flat [flatnumber=" + flatnumber + ", floor=" + floor + ", ownername=" + ownername + ", sqfts=" + sqfts
				+ ", rooms=" + rooms + "]";
	}
	
}
