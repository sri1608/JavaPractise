package classesandrelations;

public class StudentTester {


	public static void main(String[] args) {

Studentbranch b = new Studentbranch("subha", 1, 60 );
Student s = new Student(1, "subha", b, 100, 'A' );

System.out.println(b);
System.out.println(s);
	}

}
