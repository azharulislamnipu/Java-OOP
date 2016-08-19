package assainment;

public class Chef{

private String Chef_ID;
private String Chef_Name;
private String Cook_Order_Item;
private String Cook_order_ItemSize;
private String Cook_Produce;



public Chef(String Chef_ID,String Chef_Name,String Cook_Order_Item,String Cook_order_ItemSize,String Cook_Produce) {
	// TODO Auto-generated constructor stub
	this.Chef_ID = Chef_ID;
	this.Chef_Name = Chef_Name;
	this.Cook_Order_Item = Cook_Order_Item;
	this.Cook_order_ItemSize = Cook_order_ItemSize;
	this.Cook_Produce = Cook_Produce;
}


public String getChef_ID() {
	return Chef_ID;
}


public void setChef_ID(String chef_ID) {
	Chef_ID = chef_ID;
}


public String getChef_Name() {
	return Chef_Name;
}


public void setChef_Name(String chef_Name) {
	Chef_Name = chef_Name;
}


public String getCook_Order_Item() {
	return Cook_Order_Item;
}


public void setCook_Order_Item(String cook_Order_Item) {
	Cook_Order_Item = cook_Order_Item;
}


public String getCook_order_ItemSize() {
	return Cook_order_ItemSize;
}


public void setCook_order_ItemSize(String cook_order_ItemSize) {
	Cook_order_ItemSize = cook_order_ItemSize;
}


public String getCook_Produce() {
	return Cook_Produce;
}


public void setCook_Produce(String cook_Produce) {
	Cook_Produce = cook_Produce;
}




}
