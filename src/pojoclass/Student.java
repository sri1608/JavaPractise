package pojoclass;

public class Student {

	public int id;
	public String name;
	public String branch;
	public String section;
	public int totalmarks;
	public char grade;  
	
	public String toString(){
		return "id = "+  id +", name = " + name + ", branch = "+ branch + ", section = " + 
	section + ", totalmarks = " + totalmarks + " , grade = " + grade;
		
	}

}
