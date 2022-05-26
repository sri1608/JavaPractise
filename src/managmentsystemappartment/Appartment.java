package managmentsystemappartment;

import java.util.List;

public class Appartment {
	private String name;
	private String block;
	private int floors;
	private double sqfts;
	private List<Flat> flat;
	
	public Appartment() {}

	public Appartment(String name, String block, int floors, double sqfts, List<Flat> flat) {
		this.name = name;
		this.block = block;
		this.floors = floors;
		this.sqfts = sqfts;
		this.flat = flat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBlock() {
		return block;
	}

	public void setBlock(String block) {
		this.block = block;
	}

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	public double getSqfts() {
		return sqfts;
	}

	public void setSqfts(double sqfts) {
		this.sqfts = sqfts;
	}

	public List<Flat> getFlat() {
		return flat;
	}

	public void setFlat(List<Flat> flat) {
		this.flat = flat;
	}

	public String toString() {
		return "Appartment [name=" + name + ", block=" + block + ", floors=" + floors + ", sqfts=" + sqfts + ", flat="
				+ flat + "]";
	}
	

}
