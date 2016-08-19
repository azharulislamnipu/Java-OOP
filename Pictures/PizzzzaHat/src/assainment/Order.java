package assainment;



public class Order {

	private String Order_id;
	private String Order_Item;
	private double Order_Item_price;
	private String Order_Date;
	private String Order_Time;
	private String Order_Size;
	
	public Order(String Order_id,String Order_Item,double Order_Item_price,String Order_Date,String Order_Time,String Order_Size) {
		// TODO Auto-generated constructor stub
		this.Order_id = Order_id;
		this.Order_Item = Order_Item;
		this.Order_Item_price = Order_Item_price;
		this.Order_Date = Order_Date;
		this.Order_Time = Order_Time;
		this.Order_Size = Order_Size;
	}

	public String getOrder_id() {
		return Order_id;
	}

	public void setOrder_id(String order_id) {
		Order_id = order_id;
	}

	public String getOrder_Item() {
		return Order_Item;
	}

	public void setOrder_Item(String order_Item) {
		Order_Item = order_Item;
	}

	public double getOrder_Item_price() {
		return Order_Item_price;
	}

	public void setOrder_Item_price(double order_Item_price) {
		Order_Item_price = order_Item_price;
	}

	public String getOrder_Date() {
		return Order_Date;
	}

	public void setOrder_Date(String order_Date) {
		Order_Date = order_Date;
	}

	public String getOrder_Time() {
		return Order_Time;
	}

	public void setOrder_Time(String order_Time) {
		Order_Time = order_Time;
	}

	public String getOrder_Size() {
		return Order_Size;
	}

	public void setOrder_Size(String order_Size) {
		Order_Size = order_Size;
	}
	

	
	
}
