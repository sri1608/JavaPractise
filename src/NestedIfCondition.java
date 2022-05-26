
public class NestedIfCondition {

	public static void main(String[] args) {

		int students = 55;

		int marks = 100;

		if (students <= 60) {       

			if (marks > 35) {
				System.out.println("Then they will get pass mark");

			}else {
				
				System.out.println("THen they will get the failed marks");
			}
			
		}else {
			
			System.out.println("The students should be below 55 ");

		}
	}
}
