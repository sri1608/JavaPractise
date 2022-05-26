package constructor;


public class StudentTester {

	public static void main(String[] args) {
		Student s = new Student();
		s.setId(1);
		s.setName("subha");
		s.setBranch("b.pharm");
		s.setSection("A");
		s.setTotalmarks(700);
		s.setGrade('A');
		
		Student s1 = new Student();
		s1.setId(2);
		s1.setName("sangram");
		s1.setBranch("ece");
		s1.setSection("A");
		s1.setTotalmarks(750);
		s1.setGrade('A');
		
		Student s2 = new Student();
		s2.setId(3);
		s2.setName("vinay");
		s2.setBranch("mech");
		s2.setSection("B");
		s2.setTotalmarks(800);
		s2.setGrade('A');
			
		System.out.println("Student details");
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
	}
}
                                                       