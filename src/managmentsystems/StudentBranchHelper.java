package managmentsystems;

import java.util.ArrayList;

public class StudentBranchHelper {

	ArrayList<StudentBranch> branches = new ArrayList<>();
	 public boolean addStudentBranch(StudentBranch b) {
		for(StudentBranch br : branches) {
			if(br.getName().equals(b.getName())){
		return false;
		
}
			}
		branches.add(b);
		return true;
}
	 public StudentBranch getStudentBranch(int rollno) {
		 for(StudentBranch br : branches) {
			 if(br.getRollno() == rollno) {
				 return br;
			 }
		 }
		 return null;
	 }
	 public boolean deleteStudentBranch(int rollno) {
		 StudentBranch temp = null;
			boolean flag = false;
			for(StudentBranch br : branches) {
				if(br.getRollno() == rollno) {
					temp = br;
					flag = true;
				}
			
		}
			if(flag) {
				branches.remove(temp);
				return true;
			}else {
				return false;
			}
				}
	 public void increaseCapacity(int newCapacity, StudentBranch b) {
		 for(StudentBranch br : branches) {
			 if(br.getName().equals(b.getName())) {
				 br.setCapacity(newCapacity);
			 }
	 }
	 }
	 public ArrayList<StudentBranch> getAllStudentBranches(){
		 return branches;
		 
	 }
	 
	 
	 }
