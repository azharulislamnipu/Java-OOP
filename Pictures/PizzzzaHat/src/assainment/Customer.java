package assainment;

public class Customer extends Order{



	
	private String Customer_ID;
	private String Customer_Name;
	private String Customer_Email;
	private String Customer_Password;
	private String Customer_Address;
	private String Customer_Contact;
	private String Customer_Area;
	
	public Customer(String Order_id, String Order_Item, double Order_Item_price, String Order_Date, String Order_Time,
			String Order_Size,String Customer_ID,String Customer_Name,String Customer_Email,String Customer_Password,
			String Customer_Address,String Customer_Contact,String Customer_Area) {
		super(Order_id, Order_Item, Order_Item_price, Order_Date, Order_Time, Order_Size);
		// TODO Auto-generated constructor stub
		
		this.Customer_ID = Customer_ID;
		this.Customer_Name = Customer_Name;
		this.Customer_Email = Customer_Email;
		this.Customer_Password = Customer_Password;
		this.Customer_Address = Customer_Address;
		this.Customer_Contact = Customer_Contact;
		this.Customer_Area = Customer_Area;
	}
	
	
	public String getCustomer_ID() {
		return Customer_ID;
	}
	public void setCustomer_ID(String customer_ID) {
		Customer_ID = customer_ID;
	}
	public String getCustomer_Name() {
		return Customer_Name;
	}
	public void setCustomer_Name(String customer_Name) {
		Customer_Name = customer_Name;
	}
	public String getCustomer_Email() {
		return Customer_Email;
	}
	public void setCustomer_Email(String customer_Email) {
		Customer_Email = customer_Email;
	}
	public String getCustomer_Password() {
		return Customer_Password;
	}
	
	public void setCustomer_Password(String customer_Password) {
		if(customer_Password.matches(customer_Password)){
		this.Customer_Password = customer_Password;
		}
	}
	
	public String getCustomer_Address() {
		return Customer_Address;
	}
	public void setCustomer_Address(String customer_Address) {
		Customer_Address = customer_Address;
	}
	public String getCustomer_Contact() {
		return Customer_Contact;
	}
	public void setCustomer_Contact(String customer_Contact) {
		Customer_Contact = customer_Contact;
	}
	public String getCustomer_Area() {
		return Customer_Area;
	}
	public void setCustomer_Area(String customer_Area) {
		Customer_Area = customer_Area;
	}
	

	
}
