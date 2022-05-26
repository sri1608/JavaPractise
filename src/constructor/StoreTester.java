package constructor;

public class StoreTester {

	public static void main(String[] args) {
		
		Store s = new Store();
		s.setId(1);
		s.setName(" omsairam");
		s.setCardspayment(false);
		s.setAmount(130);
		s.setStoretype("General store");
		
		Store s1 = new Store();
		s1.setId(20);
		s1.setName(" Medplus");
		s.setCardspayment(true);
		s.setAmount(255.5);
		s.setStoretype("medical store");
		
		Store s2 = new Store();
		s2.setId(3);
		s2.setName(" Dmart");
		s2.setCardspayment(true);
		s2.setAmount(1500);
		s2.setStoretype("Super market");
		
		Store s3 = new Store();
		s3.setId(4);
		s3.setName(" vijetha");
		s3.setCardspayment(false);
		s3.setAmount(143);
		s3.setStoretype("milk dairy");
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		
	}

}
