package managmentsystems;

public class StudentBranch {
	private String name;
	private int rollno;
	private int capacity;
	
	public StudentBranch() {}
	public StudentBranch(String name, int rollno, int capacity) {
		this.name = name;
		this.rollno = rollno;
		this.capacity = capacity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String toString() {
		return "Studentbranch [name=" + name + ", rollno=" + rollno + ", capacity=" + capacity + "]";
	}
	
	
}
