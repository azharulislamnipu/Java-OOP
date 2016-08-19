package compareArraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListClass {

	public static void main(String[] args) {
		
		ArrayList<Student> aStudents = new ArrayList<>();
		
		aStudents.add(new Student("Roffi", 1004, 26));
		aStudents.add(new Student("Mehedi", 1002, 28));
		aStudents.add(new Student("Atiq", 1006, 18));
	//	aStudents.add(new Student(studentName, rollNo, studentAge))
		
		Collections.sort(aStudents);
		for (Student student : aStudents) {
			System.out.println(student);
		}

	}

}
