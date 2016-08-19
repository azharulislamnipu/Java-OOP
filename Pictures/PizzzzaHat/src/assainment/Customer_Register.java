package assainment;

import java.util.Scanner;

public class Customer_Register {

	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer = new Customer(null, null, 0, null, null, null,  null, null, null, null, null, null, null);
		prln("\nWelcome to Our Company\n\n");
		prln("\n\nCustomer Sign Up\n\n");
		
		prln("Enter your ID? \n");
		String customer_id = input.nextLine();
		customer.setCustomer_ID(customer_id);
		
		prln("Enter your Name? \n");
		String customer_name = input.nextLine();
		customer.setCustomer_Name(customer_name);
		
		prln("Enter your Email? \n");
		String customer_email = input.nextLine();
		customer.setCustomer_Email(customer_email);
		
		prln("Enter your Password? \n");
		String customer_password = input.nextLine();
		customer.setCustomer_Password(customer_password);
		
		prln("Enter your Address? \n");
		String customer_address = input.nextLine();
		customer.setCustomer_Address(customer_address);
		
		prln("Enter your Contact? \n");
		String customer_contact = input.nextLine();
		customer.setCustomer_Contact(customer_contact);
		
		prln("Enter your Area? \n");
		String customer_area = input.nextLine();
		customer.setCustomer_Area(customer_area);
		
		prln("You Have Successfuly Registered \n");
		prln("Custoemr ID: "+customer.getCustomer_ID()+"\nCustoemr Name: "+customer.getCustomer_Name()+"\nCustoemr Email: "+customer.getCustomer_Email()+
				"\nCustoemr Password:"+customer.getCustomer_Password()+"\nCustoemr Address: "+customer.getCustomer_Address()+
				"\nCustoemr Area: "+customer.getCustomer_Area()+"\nCustoemr Contact: "+customer.getCustomer_Contact());
		
		

	}
	

	static public void prln(Object anyObject) {
		System.out.println(anyObject);
	}
	

}
