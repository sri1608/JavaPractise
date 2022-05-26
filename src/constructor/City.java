package constructor;

public class City {
	
	private String name;
	private String state;
	private String Country;
	private double population;
	
	public City() {};

	public City(String name, String state, String country, double population) {
		this.name = name;
		this.state = state;
		Country = country;
		this.population = population;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public double getPopulation() {
		return population;
	}

	public void setPopulation(double population) {
		this.population = population;
	}

	public String toString() {
		return "City [name=" + name + ", state=" + state + ", Country=" + Country + ", population=" + population + "]";
	}
	
	
	
	
	

}
