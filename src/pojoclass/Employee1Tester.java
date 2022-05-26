package pojoclass;

public class Employee1Tester {

	public static void main(String[] args) {

		Employee1 e = new Employee1();
		e.setId(121);
		e.setName("subha ");
		e.setDesignation("analyst");
		e.setSalary(20000);
		e.setExperience(1.5);
		e.setPermanent(false);
		
		Employee1 e1 = new Employee1();
		e1.setId(122);
		e1.setName("gayatri ");
		e1.setDesignation("jr.analyst");
		e1.setSalary(40000);
		e1.setExperience(2.5);
		e1.setPermanent(true);
		
		Employee1 e2 = new Employee1();
		e2.setId(123);
		e2.setName("nagaraju ");
		e2.setDesignation("sr.analyst");
		e2.setSalary(60000);
		e2.setExperience(4.5);
	    e2.setPermanent(true);
	    
System.out.println(e);
System.out.println(e1);
System.out.println(e2);

	}
	
	

}
