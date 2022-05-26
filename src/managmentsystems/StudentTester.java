package managmentsystems;

public class StudentTester {

	public static void main(String[] args) {

		StudentHelper studenthelper = new StudentHelper();
		StudentBranchHelper studentbranchhelper = new StudentBranchHelper();
		StudentBranch cse  = new StudentBranch("cse", 1, 60);
		StudentBranch ece  = new StudentBranch("ece", 2, 50);
		StudentBranch mech  = new StudentBranch("mech", 3, 70);
		StudentBranch eee = new StudentBranch("eee", 4, 60);
		StudentBranch civil  = new StudentBranch("civil", 5, 30);
		
		Student s1 = new Student(101, "subha", cse);
		Student s2 = new Student(102, "ramya", ece);
		Student s3 = new Student(103, "heera", mech);
		Student s4 = new Student(104, "sri", mech);
		Student s5 = new Student(105, "swathi", civil);
		
		
		studentbranchhelper.addStudentBranch(cse);
		studentbranchhelper.addStudentBranch(ece);
		studentbranchhelper.addStudentBranch(cse);

		System.out.println(studentbranchhelper.getAllStudentBranches());
		studenthelper.addStudent(s1);



		
	}

}
