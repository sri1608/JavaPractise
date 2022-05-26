package constructor;

public class House {

	private String Doorno;
	private int stairs;
	private String Streetname;
	private int noofrooms;
	private double squarefeet;
	
	public House() {};

	public House(String doorno, int stairs, String streetname, int noofrooms, double squarefeet) {
	
		this.Doorno = doorno;
		this.stairs = stairs;
		this.Streetname = streetname;
		this.noofrooms = noofrooms;
		this.squarefeet = squarefeet;
	}

	public String getDoorno() {
		return Doorno;
	}

	public void setDoorno(String doorno) {
		Doorno = doorno;
	}

	public int getStairs() {
		return stairs;
	}

	public void setStairs(int stairs) {
		this.stairs = stairs;
	}

	public String getStreetname() {
		return Streetname;
	}

	public void setStreetname(String streetname) {
		Streetname = streetname;
	}

	public int getNoofrooms() {
		return noofrooms;
	}

	public void setNoofrooms(int noofrooms) {
		this.noofrooms = noofrooms;
	}

	public double getSquarefeet() {
		return squarefeet;
	}

	public void setSquarefeet(double squarefeet) {
		this.squarefeet = squarefeet;
	}

	public String toString() {
		return "House [Doorno=" + Doorno + ", stairs=" + stairs + ", Streetname=" + Streetname + ", noofrooms="
				+ noofrooms + ", squarefeet=" + squarefeet + "]";
	}
	
	
}
