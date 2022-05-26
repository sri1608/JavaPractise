package managmentsystemappartment;

import java.util.ArrayList;
import java.util.List;

public class AppartmentHelper {

	List<Appartment> appartments = new ArrayList<>();
	public boolean addAppartment(Appartment appartment) {
	
	for(Appartment apt : appartments) {
		if (apt.getName().equals(appartment.getName())) {
			return false;
			
		}
	}
	appartments.add(appartment);
	return true;
}
	public Appartment getAppartment(String name) {
		for(Appartment apt : appartments) {
			if(apt.getName().equals(name)) {
				return apt;
			}
		}
		return null;
	}
	public List<Appartment> getAllAppartments(){
		return appartments;	
	}
	
	}
