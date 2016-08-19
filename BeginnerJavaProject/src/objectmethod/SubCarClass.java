package objectmethod;

public class SubCarClass extends CarClass{

	private float chargeInBattery;
	private String colorString;
	public SubCarClass() {
		super();
		
	}
	public SubCarClass(String manu,String model, String key, int cc, float fuel,float charge,String color) {
		super(manu,model,key,cc,fuel);
		chargeInBattery = charge;
		colorString = color;
	
		
		
	}
	
	public SubCarClass(String manu,String model, String key, int cc, float fuel,float charge,String color,int year) {
		super(manu,model,key,cc,fuel,year);
		chargeInBattery = charge;
		colorString = color;

		
	}
	
	public float getChargeInBattery() {
		return chargeInBattery;
	}
	public void setChargeInBattery(float chargeInBattery) {
		this.chargeInBattery = chargeInBattery;
	}
	public String getColorString() {
		return colorString;
	}
	@Override
	public void PrintAllInfo() {
		
		super.PrintAllInfo();
		runforseconds(60);
		System.out.println("After driving 60s car Amounnt of fuel: "+presentAmountOfFuel()+" Littre");
		System.out.println("Charge In Battery: "+getChargeInBattery()+"%");
		System.out.println("Color of Car: "+getColorString());
	}

	
}
