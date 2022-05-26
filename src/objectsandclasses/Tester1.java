package objectsandclasses;

public class Tester1 {

	public static void main(String[] args) {

		Employee e = new Employee();
		e.id = 121;
		e.name = "subha ";
		e.designation = "analyst";
		e.salary = 20000;
		e.experience = 1.5;
		e.permanent = false;
		
		Employee e1 = new Employee();
		e1.id = 122;
		e1.name = "gayatri ";
		e1.designation = "jr.analyst";
		e1.salary = 40000;
		e1.experience = 2.5;
		e1.permanent = true;
		
		Employee e2 = new Employee();
		e2.id = 123;
		e2.name = "nagaraju ";
		e2.designation = "sr.analyst";
		e2.salary = 60000;
		e2.experience = 4.5;
		e2.permanent = true;
		
		System.out.println("Entering the employee details = ");
		System.out.println();
		System.out.println("Entering the first employee details :- ");
		System.out.println(e.id + ", " + e.name + ", " + e.designation + ", " + e.salary + ", " + e.experience +", " + e.permanent);
		System.out.println();
		System.out.println("Entering the second employee details :- ");
		System.out.println(e1.id + ", " + e1.name + ", " + e1.designation + ", " + e1.salary + ", " + e1.experience +", " + e1.permanent);
		System.out.println();
		System.out.println("Entering the third employee details :- ");
		System.out.println(e2.id + ", " + e2.name + ", " + e2.designation + ", " + e2.salary + ", " + e2.experience +", " + e2.permanent);

	}

}
