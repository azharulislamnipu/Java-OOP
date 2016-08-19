package collection;

import java.util.ArrayList;



public class Startup {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Azharul");
		names.add("Taniya");
		names.add("Asia");
		
		for(String aName: names){
			System.out.println(aName);
		}
		
		Student student1 = new Student("Azharul", "azharulislamnipu@gmail.com", "132-15-2717","CSE");
		Student student2 = new Student("Tanya", "taniaakter@gmail.com", "1132-152-2239","BBA");
		Student student3 = new Student("Jaman", "jaman@gmail.com", "1323-125-2312","EEE");
		
		Department dept1 = new Department();
		dept1.getStudentlist().add(student1); ///from container class
		dept1.getStudentlist().add(student2);
		dept1.getStudentlist().add(student3);
		
		for (Student anStudent : dept1.getStudentlist()) {
			System.out.println(anStudent.getName()+"\nDepartment:"+anStudent.getDepartmentName()+"\n"+anStudent.getEmail()+"\n"+anStudent.getRegNo());
		}
		
		
		ArrayList<Student> studentlist = new ArrayList<>();
		studentlist.add(student1);
		studentlist.add(student2);
		studentlist.add(student3);
		for (Student astudent : studentlist) {
			System.out.println(astudent.getName()+"\n"+astudent.getEmail()+"\n"+astudent.getRegNo());
		}
		
	}

}
