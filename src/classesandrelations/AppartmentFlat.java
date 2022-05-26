package classesandrelations;

public class AppartmentFlat {

	private int numberofflats;
	private String flatnumbers;
	private String typesofflats;
	
	public AppartmentFlat() {}

	public AppartmentFlat(int numberofflats, String flatnumbers, String typesofflats) {
		this.numberofflats = numberofflats;
		this.flatnumbers = flatnumbers;
		this.typesofflats = typesofflats;
	}

	public int getNumberofflats() {
		return numberofflats;
	}

	public void setNumberofflats(int numberofflats) {
		this.numberofflats = numberofflats;
	}

	public String getFlatnumbers() {
		return flatnumbers;
	}

	public void setFlatnumbers(String flatnumbers) {
		this.flatnumbers = flatnumbers;
	}

	public String getTypesofflats() {
		return typesofflats;
	}

	public void setTypesofflats(String typesofflats) {
		this.typesofflats = typesofflats;
	}

	public String toString() {
		return "AppartmentFlat [numberofflats=" + numberofflats + ", flatnumbers=" + flatnumbers + ", typesofflats="
				+ typesofflats + "]";
	}

}
