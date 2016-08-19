package priprodfpub;



import objectmethod.CarClass;
import objectmethod.CarProject;
import objectmethod.SubCarClass;

public class AnotherClass {


	
	public static void main(String[] args) {
		
		CarProject.main(null);
		CarClass aCar = new CarClass("MITSUBISHI", "loncer", "NIPU", 4500, 40, 2016);
		aCar.manufacturerName ="Marcedes Benze";
		SubCarClass aSubCar = new SubCarClass("NISSAN", "xizo", "nipu", 3000 , 40, 2300, "Red", 2015);
		aSubCar.PrintAllInfo();
		aCar.PrintAllInfo();
		
		AnotherSubCar newCar= new AnotherSubCar("PORSCHE", "CarrerGT", "azhar", 239, 400,2015);
		
		newCar.PrintAllInfo();
		newCar.addAmountOFFuel(10);
		System.out.println("FUel: "+newCar.presentAmountOfFuel());
		System.out.println("ModelName: "+newCar.getmodelName());
		System.out.println("Year: "+newCar.getmanufacturingYear());
	}

}
