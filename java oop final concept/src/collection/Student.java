package collection;

public class Student {

	private String name;
	private String email;
	private String regNo;
	private String departmentName;

	public Student(String newName,String newEmail,String newRegNo,String departmentName){
		name = newName;
		email = newEmail;
		regNo = newRegNo;
		this.departmentName = departmentName;

	}
	public String getDepartmentName() {
		return departmentName;
	}
	
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	
	
	
}
