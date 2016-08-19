package assainment;


public class DisplayAll {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		prln("Company Information\n");
		//only for Restaurant Company
		
		Restaurant_Admin restaurant = new Restaurant_Admin("PizzaHut", "Dhanmonddi", "Dhaka", "+8802287312", "PizzaHut is Restuarant company which is get order from customer and service to the Home Delivery", "8.30Am",  "10.00PM", null, null, 0.0, null);
		prln("Restuarant TitleName:"+restaurant.getRest_TitleName()+"\nRestuarant Location: "+restaurant.getRest_Location()+
				"\nRestuarant Adress: "+restaurant.getRest_Address()+"\nRestuarant Contact: "+restaurant.getRest_Contact()+
				"\nRestuarant About: "+restaurant.getRest_About()+"\nRestuarant OpentTime: "+restaurant.getRest_OpeningTime()+"\nRestuarant ClosingTime: "+restaurant.getRest_ClosingTime());
		
		
		
		
		prln("\n\nCustomer Information\n");
		//only For Customer Identify
		Customer customer = new Customer(null, null, 0, null, null, null, null, null, null, null, null, null, null);
		customer.setCustomer_ID("1001");
		customer.setCustomer_Name("Azharul Islam");
		customer.setCustomer_Email("azharulislam@gmail.com");
		customer.setCustomer_Password("11223344");
		customer.setCustomer_Address("Kollanpur, 5 No Raoad, 26 No House");
		customer.setCustomer_Area("Dhaka");
		customer.setCustomer_Contact("01986926212");
		
		prln("Custoemr ID: "+customer.getCustomer_ID()+"\nCustoemr Name: "+customer.getCustomer_Name()+"\nCustoemr Email: "+customer.getCustomer_Email()+
				"\nCustoemr Password:"+customer.getCustomer_Password()+"\nCustoemr Address: "+customer.getCustomer_Address()+
				"\nCustoemr Area: "+customer.getCustomer_Area()+"\nCustoemr Contact: "+customer.getCustomer_Contact());
		
		
	
		
		//Order list for Oder
		Order order1 = new Order("1001", "Pizza", 300, "12-03-16", "12:30AM", "10inc");
		Order order2 = new Order("1002", "Pizza", 200, "01-03-16", "10:30pm","12inc");
		
		
		Order_list order_list = new Order_list();
		order_list.getOrderList().add(order1);
		order_list.getOrderList().add(order2);
		
		prln("\n\n\n Order List \n");
		for (Order orderProduct : order_list.getOrderList()) {
		prln("Order Id: "+orderProduct.getOrder_id()+"\nOrder ItemName: "+orderProduct.getOrder_Item()+"\nOrderItem Price: "+orderProduct.getOrder_Item_price()+
				"\nOrder Date: "+orderProduct.getOrder_Date()+"\nOrder Time: "+orderProduct.getOrder_Time()+"\nOrder Item_size: "+orderProduct.getOrder_Size());
		
		prln("\n");
		}
		
		
		//paymentinfo
		
		prln("\nPayment Information\n");
		Payment payment = new Payment("1001","12:23pm", "02-12-16", 5.75);
		double paymentamount = payment.setPayment_Amount(300);
		prln("Payment_ID: "+payment.getPayment_ID()+"\nPayment Time: "+payment.getPayment_Time()+"\nPayment Date: "+payment.getPayment_Date()+"\nVat For Payment:"+payment.getPayment_vat()+".tk"+"\nPayment Amount: "+payment.getPayment_Amount()+".tk"+"\nTotal Amount: "+payment.Calculate_amount(paymentamount)+" .tk");
		
		
		prln("\n\n Delivery Information\n");
		DeliverBoy deliverBoy = new DeliverBoy("Junayed", "1011", "0198273123", "Yes, Delivery Completed", "12-03-16", "1:30 PM", "Kauran Bazar, Dhaka");
		prln("DeliverBoy Name: "+deliverBoy.getDeliveryBoyName()+"\nDeliverBoy ID: "+deliverBoy.getDeliveryBoyID()+"\nDeliverBoy Conatuct: "+deliverBoy.getDelivaryBoyContuct()+
				"\nDelivery Report: "+deliverBoy.getDeliveryReport()+"\nDelivery Location: "+deliverBoy.getDeliveryLocation()+"\nDelivery Date: "+deliverBoy.getDeliveryDate()
				+"\nDelivery Time: "+deliverBoy.getDeliveryTime());
		
		
		
		
		//itemList....
		prln("\n\nItemlist Information\n");
		Item item = new Item("1001", "Cake", 500.0, "Food");
		Item item2 = new Item("1002", "Choklet", 400.0, "Food");
		
		ItemList itemList = new ItemList();
		itemList.getItemlist().add(item);
		itemList.getItemlist().add(item2);
		
		for(Item itemProduc:itemList.getItemlist()){
			prln("Item_ID: "+itemProduc.getItem_ID()+"\nItem_Name: "+itemProduc.getItem_Name()+"\nItem_Price"+itemProduc.getItem_price()+"\nItem_Type: "+itemProduc.getItem_type());
			prln("\n");
		}
		
		prln("\n\nChef Which Produce The Order Item \n");
		Chef chef = new Chef("11001", "Raoky", "Pizza", "12 inc","poduce Complete to DeliveryBoy");
		prln("Chef_ID: "+chef.getChef_ID()+"\nChef_Name: "+chef.getChef_Name()+
				"\nCook_Order_Item: "+chef.getCook_Order_Item()+"\nCook_Order_ItemSize: "+chef.getCook_order_ItemSize()+
				"\nChef Produce Item: "+chef.getCook_Produce());
	}

	static public void prln(Object anyObject) {
		System.out.println(anyObject);
	}
	
}
