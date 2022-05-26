package managmentsystemappartment;

import java.util.ArrayList;
import java.util.List;

public class FlatHelper {

	List<Flat> flats = new ArrayList<>();
	public boolean addFlat(Flat flat) {
		for(Flat f : flats) {
			if(f.getFlatnumber() == flat.getFlatnumber()) {
				return false;
			}
		}
		flats.add(flat);
		return true;
	}
	public Flat getFlat(int flatnumber) {
		for(Flat flat : flats) {
		if(flat.getFlatnumber() == flatnumber) {
			return flat;
		}
		}
		return null;
		}
	public List<Flat> getAllFlats(){
		return flats;
	}
	
	}


