package finalStaticExample;

public class Employee {

	public String name;
	public String email;
	
	public static final double salary;
	
	static{
		salary = 10000;
	}
	
	public final String id; //final use for fixed not constant
	
	
	
	public Employee(String id) {
		this.id = id;
	}
	
	public void m1(final int c) {
		//c = 120;
		//final int a;
		//a = 100;
		//a =355;
		//salary = 344;
		
		
	}
}
