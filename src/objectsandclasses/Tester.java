package objectsandclasses;

public class Tester {

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

System.out.println("Entering the student details = ");
System.out.println();
System.out.println("Entering the first student details :- ");
System.out.println(s.id + ", " + s.name + ", " + s.branch + ", " + s.section + ", " + s.totalmarks + ", " + s.grade);
System.out.println();
System.out.println("Entering the second student details :- ");
System.out.println(s1.id + ", " + s1.name + ", " + s1.branch + ", " + s1.section + ", " + s1.totalmarks + ", " + s1.grade);
System.out.println();
System.out.println("Entering the third student details :- ");
System.out.println(s2.id + ", " + s2.name + ", " + s2.branch + ", " + s2.section + ", " + s2.totalmarks + ", " + s2.grade);
System.out.println();
System.out.println("Entering the fourth student details :- ");
System.out.println(s3.id + ", " + s3.name + ", " + s3.branch + ", " + s3.section + ", " + s3.totalmarks + ", " + s3.grade);
System.out.println();
System.out.println("Entering the fifth student details :- ");
System.out.println(s4.id + ", " + s4.name + ", " + s4.branch + ", " + s4.section + ", " + s4.totalmarks + ", " + s4.grade);

	}

}
