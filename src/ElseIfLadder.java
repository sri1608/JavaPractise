
public class ElseIfLadder {

	public static void main(String[] args) {
		
		int a = 30;
		
		if(a < 10) {
			
			System.out.println("The value is less than 10 -> " + a);
			
		}else if(a < 20) {
			
			System.out.println("The value is less than 20 -> " + a);
			
		}else if(a < 30 ) {
			
			System.out.println("The value is less than 30 -> " + a);
			
		}else if (a < 40) {
			
			System.out.println("The value is less than 40 -> " + a);
			
		}else {
			System.out.println("The value is greater than 40 -> " + a);
		}
	}

}
