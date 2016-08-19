package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparator {

	public static void main(String[] args) {

		ArrayList<StudentC> Studentlist = new ArrayList<>();
		Studentlist.add(new StudentC("raju", 102, 27));
		Studentlist.add(new StudentC("Saddam",104, 19));
		Studentlist.add(new StudentC("Babu", 109, 25));
		Studentlist.add(new StudentC("Azhar", 103, 18));
		Studentlist.add(new StudentC("Labib", 101, 29));
		Studentlist.add(new StudentC("Ontim", 110, 20));
		
		System.out.println("Student Name Sorting:\n");
		
		Collections.sort(Studentlist, StudentC.studentNameComparator);
		for (StudentC student : Studentlist) {
			System.out.println(student);
		}
		
		
		
		 System.out.println("\n\n RollNum Sorting: \n");
		   Collections.sort(Studentlist, StudentC.StuRollno);
		   for(StudentC str: Studentlist){
				System.out.println(str);
		   }
		  
	}

}
