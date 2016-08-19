package constructorOveridding;

public class Startup {

	public static void main(String[] args) {
		Person person1 = new Person("S.m.", "Firoz", "Ahmed");
//		person1.setFirstName("MD.");
//		person1.setMiddleName("Azharul Islam");
//		person1.setLastName("Nipu");
		
		String fullName = person1.getFullName();
		prln(fullName);
		
		Person person2 = new Person("Sabbir", "hossain");
		String fullName1 = person2.getFullName();
		prln(fullName1);
		
		Person person3 = new Person();
		person3.setFirstName("Azhar");
		person3.setMiddleName("Islam");
		person3.setLastName("Nipu");
		String fullName2 = person3.getFullName();
		prln(fullName2);
		
	}
	static public void prln(Object anyObject) {
		System.out.println(anyObject);

	}

}
