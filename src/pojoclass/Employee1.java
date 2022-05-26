package pojoclass;

public class Employee1 {
	private int id;
	private String name;
	private String designation;
	private int salary;
	private double experience;
	private boolean permanent;

	public  Employee1() {};

	public Employee1(int id, String name, String designation, int salary,
			double experience, boolean permanent) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.experience = experience;
		this.permanent = permanent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getExperience() {
		return experience;
	}

	public void setExperience(double experience) {
		this.experience = experience;
	}

	public boolean isPermanent() {
		return permanent;
	}

	public void setPermanent(boolean permanent) {
		this.permanent = permanent;
	}

	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary
				+ ", experience=" + experience + ", permanent=" + permanent + "]";
	}	
	
}
