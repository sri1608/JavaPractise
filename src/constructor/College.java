package constructor;

public class College {
	
	private int studentadmissions;
	private String branch;
	private int fee;
	private String facilities;
	
	public College() {}

	public College(int studentadmissions, String branch, int fee, String facilities) {

		this.studentadmissions = studentadmissions;
		this.branch = branch;
		this.fee = fee;
		this.facilities = facilities;
	}

	public int getStudentadmissions() {
		return studentadmissions;
	}

	public void setStudentadmissions(int studentadmissions) {
		this.studentadmissions = studentadmissions;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public String getFacilities() {
		return facilities;
	}

	public void setFacilities(String facilities) {
		this.facilities = facilities;
	}

	public String toString() {
		return "College [studentadmissions=" + studentadmissions + ", branch=" + branch + ", fee=" + fee
				+ ", facilities=" + facilities + "]";
	}

	
}
