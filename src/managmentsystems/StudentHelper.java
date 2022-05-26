package managmentsystems;

import java.util.ArrayList;
import java.util.List;

public class StudentHelper {
	
	ArrayList<Student> students = new ArrayList<>();
	public boolean addStudent(Student s) {
		for(Student std : students) {
			if(std.getId() ==s.getId()) {
				return false;
			}
		}
		students.add(s);
		return true;
	}
public Student getStudent(int id) {
	for(Student std : students) {
		if(std.getId() == id) {
			return std;
}
	}
	return null;
	
}

public boolean deleteStudent(int id) {
	Student temp = null;
	boolean flag = false;
	for(Student std : students) {
		if(std.getId() == id) {
			temp = std;
			flag = true;
		}
	
}
	if(flag) {
		students.remove(temp);
		return true;
	}else {
		return false;
	}
}
public ArrayList<Student> getAllStudents(){
	return students;	
	
}
public ArrayList<Student> getStudentsByBranch(StudentBranch b){
	ArrayList<Student> list = new ArrayList<>();
	
	for(Student std : students) {
		//Branch temp = std.getBranch();
		//String name = temp.getName();
		//String name2 = b.getName();
		//if(name.equals(name2)){};
		if(std.getStudentBranch().getName().equals(b.getName())) {
			list.add(std);
		}
	}
	return list;
}
public void replaceStudent(Student s1, Student s2 ) {
	deleteStudent(s1.getId());
	addStudent(s2);
}
}
