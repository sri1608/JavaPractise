package managmentsystems;

public class Student {
	private int id;
	private String name;
	private StudentBranch studentbranch;
	
	
	public Student() {}

	public Student(int id, String name, StudentBranch studentbranch) {
		this.id = id;
		this.name = name;
		this.studentbranch = studentbranch;
		
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

	public StudentBranch getStudentBranch() {
		return studentbranch;
	}

	public void setBranch(StudentBranch studentbranch) {
		this.studentbranch = studentbranch;
	}

	
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", studentbranch=" + studentbranch + "]";
				
	}

	
	
}