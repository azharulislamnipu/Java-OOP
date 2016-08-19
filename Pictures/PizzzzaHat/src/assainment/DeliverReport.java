package assainment;

import java.util.Scanner;

public class DeliverReport extends DeliverBoy{

	public DeliverReport(String DeliveryBoyName, String DeliveryBoyID, String DelivaryBoyContuct, String DeliveryReport,
			String DeliveryDate, String DeliveryTime, String DeliveryLocation) {
		super(DeliveryBoyName, DeliveryBoyID, DelivaryBoyContuct, DeliveryReport, DeliveryDate, DeliveryTime, DeliveryLocation);
		// TODO Auto-generated constructor stub
	}
	
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//paymentinfo
		
		prln("\nPayment Information\n");
		
		
		prln("\nEnter Your Amount\n");
		double pay = input.nextDouble();
		Payment payment = new Payment("1001","12:23pm", "02-12-16", 5.75);
		double paymentamount = payment.setPayment_Amount(pay);
		prln("Payment_ID: "+payment.getPayment_ID()+"\nPayment Time: "+payment.getPayment_Time()+"\nPayment Date: "+payment.getPayment_Date()+"\nVat For Payment:"+payment.getPayment_vat()+".tk"+"\nPayment Amount: "+payment.getPayment_Amount()+".tk"+"\nTotal Amount: "+payment.Calculate_amount(paymentamount)+" .tk");
		
		prln("\n\nDelivery Sucess\n\n\n ");
		
		prln("\n\n Delivery Information\n");
		DeliverBoy deliverBoy = new DeliverBoy("Junayed", "1011", "0198273123", "Yes, Delivery Completed", "12-03-16", "1:30 PM", "Kauran Bazar, Dhaka");
		prln("DeliverBoy Name: "+deliverBoy.getDeliveryBoyName()+"\nDeliverBoy ID: "+deliverBoy.getDeliveryBoyID()+"\nDeliverBoy Conatuct: "+deliverBoy.getDelivaryBoyContuct()+
				"\nDelivery Report: "+deliverBoy.getDeliveryReport()+"\nDelivery Location: "+deliverBoy.getDeliveryLocation()+"\nDelivery Date: "+deliverBoy.getDeliveryDate()
				+"\nDelivery Time: "+deliverBoy.getDeliveryTime());
		
		
		
	}
	
	static public void prln(Object anyObject) {
		System.out.println(anyObject);
	}
	

}
