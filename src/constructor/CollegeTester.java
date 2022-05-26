package constructor;

public class CollegeTester {

	public static void main(String[] args) {
 
		College c = new College();
		c.setStudentadmissions(40);
		c.setBranch("cse");
		c.setFee(25000);
		c.setFacilities("bus");
		
		College c1 = new College();
		c1.setStudentadmissions(40);
		c1.setBranch("mech");
		c1.setFee(35000);
		c1.setFacilities("bus ' hostel");
		
		College c2 = new College();
		c2.setStudentadmissions(20);
		c2.setBranch("civil");
		c2.setFee(20000);
		c2.setFacilities("bus");
		
		College c3 = new College();
		c3.setStudentadmissions(30);
		c3.setBranch("IT");
		c3.setFee(25000);
		c3.setFacilities("hostel");
		
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

		
		

	}

}
