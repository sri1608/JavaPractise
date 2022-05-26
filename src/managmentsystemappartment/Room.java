package managmentsystemappartment;

public class Room {

	private int roomid;
	private String roomtype;
	private double sqft;
	public Room() {}
	public Room(int roomid, String roomtype, double sqft) {
		this.roomid = roomid;
		this.roomtype = roomtype;
		this.sqft = sqft;
	}
	public int getRoomid() {
		return roomid;
	}
	public void setRoomid(int roomid) {
		this.roomid = roomid;
	}
	public String getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}
	public double getSqft() {
		return sqft;
	}
	public void setSqft(double sqft) {
		this.sqft = sqft;
	}
	public String toString() {
		return "Room [roomid=" + roomid + ", roomtype=" + roomtype + ", sqft=" + sqft + "]";
	}
	
}
