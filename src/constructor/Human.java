package constructor;

public class Human {

	private String name;
	private int height;
	private double weight;
	private String gender;
	private boolean alive;
	
	public Human() {};

	public Human(String name, int height, double weight, String gender, boolean alive) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
		this.alive = alive;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public String toString() {
		return "Human [name=" + name + ", height=" + height + ", weight=" + weight + ", gender=" + gender + ", alive="
				+ alive + "]";
	}
	
	
	
}
