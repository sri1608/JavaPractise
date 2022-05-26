package objectsandclasses;

public class Tester4 {

	public static void main(String[] args) {
		
		Store s = new Store();
		s.id = 1;
		s.name = " omsairam";
		s.cardspayment = false;
		s.amount = 130;
		s.Storetype = "General store";
		
		Store s1 = new Store();
		s1.id = 2;
		s1.name = " Medplus";
		s.cardspayment = true;
		s.amount = 255.5;
		s.Storetype = "medical store";
		
		Store s2 = new Store();
		s2.id = 3;
		s2.name = " Dmart";
		s2.cardspayment = true;
		s2.amount = 1500;
		s2.Storetype = "Super market";
		
		Store s3 = new Store();
		s3.id = 4;
		s3.name = " vijetha";
		s3.cardspayment = false;
		s3.amount = 143;
		s3.Storetype = "milk dairy";
		
		System.out.println("Entering the store details :");
		System.out.println();
		System.out.println("Entering the first store details :");
		System.out.println(s.id + ", " + s.name + ", " + s.cardspayment + ", " + s.amount + ", " + s.Storetype);
		System.out.println();
		System.out.println("Entering the second store details :");
		System.out.println(s1.id + ", " + s1.name + ", " + s1.cardspayment + ", " + s1.amount + ", " + s1.Storetype);
        System.out.println();
		System.out.println("Entering the third store details :");
		System.out.println(s2.id + ", " + s2.name + ", " + s2.cardspayment + ", " + s2.amount + ", " + s2.Storetype); 
		System.out.println();
		System.out.println("Entering the fourth store details :");		
		System.out.println(s3.id + ", " + s3.name + ", " + s3.cardspayment + ", " + s3.amount + ", " + s3.Storetype);

	}

}
