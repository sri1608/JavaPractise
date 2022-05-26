package managmentsystemappartment;

import java.util.ArrayList;
import java.util.List;

public class RoomHelper {

	List<Room> rooms = new ArrayList<>();
	
	public boolean addRoom(Room room) {
		for(Room r : rooms) {
			if(r.getRoomid() == room.getRoomid()) {
				return false;
			} 
		}
		rooms.add(room);
		return true;
	}
	public Room getRoom(int roomid) {
		for(Room r : rooms) {
			if(r.getRoomid() == roomid) {
				return r;
			}
		} 
		return null;
	}
	public List<Room> getAllRooms(){
		return rooms;
	}
}
