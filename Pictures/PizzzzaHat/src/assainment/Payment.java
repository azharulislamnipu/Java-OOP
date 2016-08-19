package assainment;

public class Payment {
	private String Payment_ID;
	private double Payment_Amount;
	private String Payment_Time;
	private String Payment_Date;
	private double Payment_vat;
	//private double Payment_TotalAmount;
	
	public Payment(String Payment_ID,String Payment_Time,String Payment_Date,double Payment_vat) {
		// TODO Auto-generated constructor stub
		this.Payment_ID = Payment_ID;
		this.Payment_Time = Payment_Time;
		this.Payment_Date = Payment_Date;
		this.Payment_vat = Payment_vat;
	
	}
	
	
	public String getPayment_ID() {
		return Payment_ID;
	}
	public void setPayment_ID(String payment_ID) {
		Payment_ID = payment_ID;
	}
	public double getPayment_Amount() {
		return Payment_Amount;
	}
	public double setPayment_Amount(double payment_Amount) {
		return Payment_Amount = payment_Amount;
	}
	public String getPayment_Time() {
		return Payment_Time;
	}
	public void setPayment_Time(String payment_Time) {
		Payment_Time = payment_Time;
	}
	public String getPayment_Date() {
		return Payment_Date;
	}
	public void setPayment_Date(String payment_Date) {
		Payment_Date = payment_Date;
	}
	public double getPayment_vat() {
		return Payment_vat;
	}
	public void setPayment_vat(double payment_vat) {
		Payment_vat = payment_vat;
	}
	
	public double Calculate_amount(double Payment_Amount) {
		double Total= Payment_Amount + Payment_vat;
		return Total;
	}
	
	
	
	
	
	

}
