package constructor;

public class Student {
	
	private int id;
	private String name;
	private String branch;
	private String section;
	private  int totalmarks;
	private char grade; 

public Student() {}
	public Student(int id, String name, String branch, String section) {
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.section = section;
	}

	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public int getTotalmarks() {
		return totalmarks;
	}
	public void setTotalmarks(int totalmarks) {
		if(totalmarks > 0) {
			this.totalmarks = totalmarks;
		}else {
		this.totalmarks = 0;
	}
		}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
		}
	
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", branch=" + branch + ", section=" + section + ", totalmarks="
				+ totalmarks + ", grade=" + grade + "]";
	
	}
	}


