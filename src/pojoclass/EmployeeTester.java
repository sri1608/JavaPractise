package pojoclass;

public class EmployeeTester {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId(12345);
		e.setName("subha");
		e.setDesignation("analyst");
		e.setSalary(20000);
		e.setExperience(1.5);
		System.out.println("id = " + e.getId());
		System.out.println("name = " + e.getName());
		System.out.println("designation = " + e.getDesignation());
		System.out.println("Salary = " + e.getSalary());
		System.out.println("Experience = " + e.getExperience());

	}
}
