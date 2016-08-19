package interFace;

public class Employee implements BasicInformation{
	private String name;
	private String address;
	private String employeeId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	
//	public String findAllInfo() {
//		return "Name:"+name+"Address:"+address+"EmployeId:"+employeeId;
//	}

	@Override
	public String GetBasicInfo() {
		return "Name:"+name+"Address:"+address+"EmployeId:"+employeeId;
	}

}
