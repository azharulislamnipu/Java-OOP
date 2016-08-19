package comparator;

import java.util.Comparator;

public class StudentC {

	private String studentName;
	private int rollNo;
	private int studentAge;

	public StudentC(String studentName, int rollNo, int studentAge) {
		this.studentName = studentName;
		this.rollNo = rollNo;
		this.studentAge = studentAge;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public static Comparator<StudentC> studentNameComparator = new Comparator<StudentC>() {

		@Override
		public int compare(StudentC s1, StudentC s2) {
			String studentName1 = s1.getStudentName();
			String studentName2 = s2.getStudentName();
			return studentName1.compareToIgnoreCase(studentName2);
		}
	};

	public static Comparator<StudentC> StuRollno = new Comparator<StudentC>() {

		public int compare(StudentC s1, StudentC s2) {

			int rollno1 = s1.getRollNo();
			int rollno2 = s2.getRollNo();

			/* For ascending order */
			return rollno1 - rollno2;

			/* For descending order */
			// rollno2-rollno1;
		}
	};

	@Override
	public String toString() {
		return "[ rollno=" + rollNo + ", name=" + studentName + ", age="
				+ studentAge + "]";
	}

}
