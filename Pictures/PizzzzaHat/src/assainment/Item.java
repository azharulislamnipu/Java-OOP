package assainment;

public class Item {
	private String Item_ID;
	private String Item_Name;
	private double Item_price;
	private String Item_type;
	
	public Item(String Item_ID,String Item_Name,Double order_item_price, String Item_type) {
		// TODO Auto-generated constructor stub
		this.Item_ID = Item_ID;
		this.Item_Name = Item_Name;
		this.Item_price = order_item_price;
		this.Item_type = Item_type;
	}
	
	public String getItem_ID() {
		return Item_ID;
	}
	public void setItem_ID(String item_ID) {
		Item_ID = item_ID;
	}
	public String getItem_Name() {
		return Item_Name;
	}
	public void setItem_Name(String item_Name) {
		Item_Name = item_Name;
	}
	public double getItem_price() {
		return Item_price;
	}
	public void setItem_price(Double item_price) {
		Item_price = item_price;
	}
	public String getItem_type() {
		return Item_type;
	}
	public void setItem_type(String item_type) {
		Item_type = item_type;
	}
	
	

}
