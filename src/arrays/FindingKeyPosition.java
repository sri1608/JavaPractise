package arrays;

public class FindingKeyPosition {

	public static void main(String[] args) {
		
		int a[] = {99, 77, 85, 97, 55, 867,87,55};
		int key = 55;
		boolean position[] = new boolean[a.length];
		boolean b = false;  
		for(int i = 0; i < a.length; i++) {
			if(a[i] == key) {
				b = true; 
				position[i] = true;
			}
		}
	if(b) {
		System.out.println(key + " found in position :- ");
		for(int i = 0; i < position.length; i++) {
			if(position[i] == true) {
				System.out.print(i+1 + "  ");
				
			}
		}
	}else {
		System.out.println(key + " is not found. ");
	}
	}

}
