package assainment;

import java.util.Scanner;

public class Restaurant_Admin extends Item {



	private String Rest_TitleName;
	private String Rest_Location;
	private String Rest_Address;
	private String Rest_Contact;
	private String Rest_About;
	private String Rest_OpeningTime;
	private String Rest_ClosingTime;
	public Restaurant_Admin(String Rest_TitleName,String Rest_Location,String Rest_Address,String Rest_Contact,String Rest_About,String Rest_OpeningTime,String Rest_ClosingTime,String Item_ID, String Item_Name, double Item_price, String Item_type) {
		super(Item_ID, Item_Name, Item_price, Item_type);
		// TODO Auto-generated constructor stub
		
		this.Rest_TitleName= Rest_TitleName;
		this.Rest_Location = Rest_Location;
		this.Rest_Address = Rest_Address;
		this.Rest_Contact = Rest_Contact;
		this.Rest_About = Rest_About;
		this.Rest_OpeningTime = Rest_OpeningTime;
		this.Rest_ClosingTime = Rest_ClosingTime;
		
	}
	
	
	
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		prln("Welcome To Admin Page\n\n");
		
		
		prln("Insert Your Item\n\n");
			prln("Enter ItemID ?");
			String order_id = input.nextLine();
			prln("Enter ItemName ?");
			String order_item = input.nextLine();
			prln("Enter Item_type ?");
			String order_item_type = input.nextLine();
			
			prln("Enter Item_price?");
			Double order_item_price = input.nextDouble();
			
			
		
			prln("\n\nItemlist Information\n");
			Item item = new Item(order_id, order_item, order_item_price, order_item_type);
			Item item1 = new Item("1001", "Pizza", 300.0, "Food");
			Item item2 = new Item("1002", "Choklet", 200.0, "Food");
			Item item3 = new Item("102", "Burger", 400.0, "Food");
			Item item4 = new Item("103", "Choklet", 300.0, "Food");
			Item item5 = new Item("104", "Chiken", 700.0, "Food");
			ItemList itemList = new ItemList();
			itemList.getItemlist().add(item);
			itemList.getItemlist().add(item1);
			itemList.getItemlist().add(item2);
			itemList.getItemlist().add(item3);
			itemList.getItemlist().add(item4);
			itemList.getItemlist().add(item5);
			
			
			for(Item itemProduc:itemList.getItemlist()){
				prln("Item_ID: "+itemProduc.getItem_ID()+"\nItem_Name: "+itemProduc.getItem_Name()+"\nItem_Price: "+itemProduc.getItem_price()+"\nItem_Type: "+itemProduc.getItem_type());
				prln("\n");
			}
				
		
	}
	static public void prln(Object anyObject) {
		System.out.println(anyObject);
	}

	
	
	
	
	public String getRest_TitleName() {
		return Rest_TitleName;
	}

	public void setRest_TitleName(String rest_TitleName) {
		if(rest_TitleName.length()<=3){
		this.Rest_TitleName = rest_TitleName;
		}
	}

	public String getRest_Location() {
		return Rest_Location;
	}

	public void setRest_Location(String rest_Location) {
		Rest_Location = rest_Location;
	}

	public String getRest_Address() {
		return Rest_Address;
	}

	public void setRest_Address(String rest_Address) {
		Rest_Address = rest_Address;
	}

	public String getRest_Contact() {
		return Rest_Contact;
	}

	public void setRest_Contact(String rest_Contact) {
		Rest_Contact = rest_Contact;
	}

	public String getRest_About() {
		return Rest_About;
	}

	public void setRest_About(String rest_About) {
		Rest_About = rest_About;
	}

	public String getRest_OpeningTime() {
		return Rest_OpeningTime;
	}

	public void setRest_OpeningTime(String rest_OpeningTime) {
		Rest_OpeningTime = rest_OpeningTime;
	}

	public String getRest_ClosingTime() {
		return Rest_ClosingTime;
	}

	public void setRest_ClosingTime(String rest_ClosingTime) {
		Rest_ClosingTime = rest_ClosingTime;
	}
	
	
	

}
