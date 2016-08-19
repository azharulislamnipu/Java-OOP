package objectmethod;

public class CarClass {  //superclass or base class
	public String manufacturerName;
	private String modelName;
	int engineCC;
	private float fuelAmount;
	public float carWight;
	
	private String carkeyValue;
	
	protected int manufacturingYear;
	final private float amountofFuelconsumedperSeconds = 0.02f;
	public CarClass(){  //constructor
		manufacturerName = new String();
		modelName = new String();
		engineCC =1200;
		manufacturingYear=0;
		fuelAmount =0;
	}
	
	public CarClass(String carName){
		manufacturerName = new String(carName);
		modelName = new String();
		engineCC =0;
		manufacturingYear=0;
		fuelAmount =0;
	}
	public CarClass(String manu, String modelname, String key,int engineCC,float fuel) {
		manufacturerName = manu;
		this.modelName = modelname;
		carkeyValue = key;
		this.engineCC= engineCC;
		fuelAmount = fuel;
		manufacturingYear=0;
	}
	public CarClass(String manu, String modelname, String key,int engineCC,float fuel,int year) {
		this(manu, modelname, key, engineCC, fuel);
		manufacturingYear = year;
	}
	
	public void addfuel(float fuelAmount) {
		this.fuelAmount+=fuelAmount;
	}
	public void runforseconds(int timeInseconds ) {
		float usefuel= timeInseconds*amountofFuelconsumedperSeconds;
		fuelAmount-=usefuel;
	}
	
	
	public float presentAmountOfFuel() {
		return fuelAmount;
		
	}
	public String getmanufacturerName(){
		return manufacturerName;
	}
	public String getmodelName(){
		return modelName;
	}
	
	public boolean matchPassword(String userInput) {
		return userInput.equals(carkeyValue);
	}
	
	public void PrintAllInfo() {
		System.out.println("\n\n\n");
		System.out.println("manufacturer: "+manufacturerName);
		System.out.println("modelName: "+getmodelName());
		System.out.println("PasswordMatch: "+matchPassword("nipu"));
		System.out.println("EngineCC: "+engineCC);
		System.out.println("Amounnt of fuel: "+presentAmountOfFuel()+" Littre");
		addfuel(2);
		System.out.println("After adding Amounnt of fuel: "+presentAmountOfFuel()+" Littre");
		
	}


}
