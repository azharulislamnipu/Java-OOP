package staticExample;

public class Trainee {

	private String name;
	private String email;
	private String regNo;
	
	private static int noOfTrainees; //static data /class level data

	static{
		System.out.println("I ma Static Block1");
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

	public static int getNoOfTrainees() {
		return noOfTrainees;
	}

	public static void setNoOfTrainees(int noOfTrainees) {
		Trainee.noOfTrainees = noOfTrainees;
	}
	
	static{
		System.out.println("I ma Static Block2");
	}
	
	
	
	
	
}
