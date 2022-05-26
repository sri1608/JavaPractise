package classesandrelations;

public class Student {
	private int id;
	private String name;
	private Studentbranch studentbranch;
	private  int totalmarks;
	private char grade;
	
	public Student() {}

	public Student(int id, String name, Studentbranch studentbranch, int totalmarks, char grade) {
		this.id = id;
		this.name = name;
		this.studentbranch = studentbranch;
		this.totalmarks = totalmarks;
		this.grade = grade;
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

	public Studentbranch getstudentBranch() {
		return studentbranch;
	}

	public void setBranch(Studentbranch studentbranch) {
		this.studentbranch = studentbranch;
	}

	public int getTotalmarks() {
		return totalmarks;
	}

	public void setTotalmarks(int totalmarks) {
		this.totalmarks = totalmarks;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", studentbranch=" + studentbranch + ", totalmarks=" + totalmarks + ", grade="
				+ grade + "]";
	}

	
}