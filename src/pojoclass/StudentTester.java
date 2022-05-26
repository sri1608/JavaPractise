package pojoclass;

public class StudentTester {

	public static void main(String[] args) {
		Student s = new Student();
		s.id = 1;
		s.name = "subha";
		s.branch = "b.pharm";
		s.section = "A";
		s.totalmarks = 700;
		s.grade = 'A';
		
		Student s1 = new Student();
		s1.id = 2;
		s1.name = "sangram";
		s1.branch = "ece";
		s1.section = "A";
		s1.totalmarks = 750;
		s1.grade = 'A';
		
		Student s2 = new Student();
		s2.id = 3;
		s2.name = "vinay";
		s2.branch = "mech";
		s2.section = "B";
		s2.totalmarks = 800;
		s2.grade = 'A';
		
		Student s3 = new Student();
		s3.id = 4;
		s3.name = "surya";
		s3.branch = "cse";
		s3.section = "c";
		s3.totalmarks = 600;
		s3.grade = 'B';
		
		Student s4 = new Student();
		s4.id = 5;
		s4.name = "uday";
		s4.branch = "it";
		s4.section = "D";
		s4.totalmarks = 500;
		s4.grade = 'C';
			
		
		System.out.println("Student details");
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);


	}
}
