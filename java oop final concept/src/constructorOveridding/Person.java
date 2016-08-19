package constructorOveridding;

public class Person {
	
	public Person(String firstName,String middleName,String lastName){
		this(firstName,lastName);
		setMiddleName(middleName);
		
	}
	public Person(String firstName,String lastName){
		this();
		setFirstName(firstName);
		setLastName(lastName);
	}

	public Person(){
		
	}
	
	private String firstName;
	private String middleName;
	private String lastName;
	
	public String getFullName() {
		if (middleName !=null) {
			return getFirstName()+" "+getMiddleName()+" "+getLastName();
		}else {
			return getFirstName()+" "+getLastName();
		}
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
}
