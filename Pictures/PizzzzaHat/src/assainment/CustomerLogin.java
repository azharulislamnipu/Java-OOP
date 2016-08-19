package assainment;

import java.util.Scanner;

public class CustomerLogin {

	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prln("\nWelcome to Our Company\n\n");
		prln("\nCustomer Login\n\n");
		
		prln("Enter your ID? \n");
		String customer_id = input.nextLine();
		
		prln("Enter your Email? \n");
		String customer_email = input.nextLine();
		
		prln("Enter your Password? \n");
		String customer_password = input.nextLine();
		
		Customer customer = new Customer(null, null, 0.0, null, null, null, customer_id, null, customer_email, customer_password, null, null, null);
		
		prln("Customer ID: "+customer.getCustomer_ID()+"\nCustomer Email:"+customer.getCustomer_Email()+"\nCustemer Password: "+customer.getCustomer_Password());
		
		
		//itemList....
		prln("\n\nItemlist here\n");
		Item item = new Item("1001", "Pizza", 300.0, "Food");
		Item item2 = new Item("1002", "Choklet", 200.0, "Food");
		
		ItemList itemList = new ItemList();
		itemList.getItemlist().add(item);
		itemList.getItemlist().add(item2);
		
		for(Item itemProduc:itemList.getItemlist()){
			prln("Item_ID: "+itemProduc.getItem_ID()+"\nItem_Name: "+itemProduc.getItem_Name()+"\nItem_Price"+itemProduc.getItem_price()+"\nItem_Type: "+itemProduc.getItem_type());
			prln("\n");
		}
		
		
		
		
		
		
		//Order list for Oder
		Order order1 = new Order("1001", "Pizza", 300.0, "12-03-16", "12:30AM", "10inc");
		Order order2 = new Order("1002", "Choklet", 200.0, "01-03-16", "10:30pm","12inc");
				
				
		Order_list order_list = new Order_list();
		order_list.getOrderList().add(order1);
		order_list.getOrderList().add(order2);
		
		prln("\nOreder Please: \n");
		prln("\nEnter your OrderItem_ID? \n");
		String oderItem_ID = input.nextLine();
		
				
		prln("\n\n\n Order List \n");
		for (Order orderProduct : order_list.getOrderList()) {
		prln("Order Id: "+orderProduct.getOrder_id()+"\nOrder ItemName: "+orderProduct.getOrder_Item()+"\nOrderItem Price: "+orderProduct.getOrder_Item_price()+
				"\nOrder Date: "+orderProduct.getOrder_Date()+"\nOrder Time: "+orderProduct.getOrder_Time()+"\nOrder Item_size: "+orderProduct.getOrder_Size());
				
		prln("\n");
		}
		
		
		if (oderItem_ID.matches(order1.getOrder_id())) {
			prln("After Order\n");
			prln("Order Id: "+order1.getOrder_id()+"\nOrder ItemName: "+order1.getOrder_Item()+"\nOrderItem Price: "+order1.getOrder_Item_price()+
					"\nOrder Date: "+order1.getOrder_Date()+"\nOrder Time: "+order1.getOrder_Time()+"\nOrder Item_size: "+order1.getOrder_Size());
			prln("You have SuccessFully Ordered");
			
		}else if (oderItem_ID.matches(order2.getOrder_id())) {
			prln("After Order\n");
			prln("Order Id: "+order2.getOrder_id()+"\nOrder ItemName: "+order2.getOrder_Item()+"\nOrderItem Price: "+order2.getOrder_Item_price()+
					"\nOrder Date: "+order2.getOrder_Date()+"\nOrder Time: "+order2.getOrder_Time()+"\nOrder Item_size: "+order2.getOrder_Size());
			prln("You have SuccessFully Ordered");
		}
		else{
			prln("your id is wrong");
		}
		
	}


	static public void prln(Object anyObject) {
		System.out.println(anyObject);
	}
}
