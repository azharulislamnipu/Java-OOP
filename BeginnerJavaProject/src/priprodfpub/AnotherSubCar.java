package priprodfpub;

import objectmethod.CarClass;

public class AnotherSubCar extends CarClass implements CarInterface {

	public AnotherSubCar() {
		super();
		
		
	}
	
	public AnotherSubCar(String carName){
		super(carName);
	}
	public AnotherSubCar(String manu, String modelname, String key,int engineCC,float fuel) {
		super(manu, modelname, key, engineCC, fuel);
	}
	public AnotherSubCar(String manu, String modelname, String key,int engineCC,float fuel,int year) {
		super(manu, modelname, key, engineCC, fuel, year);
	}
	

	public static void main(String[] args) {
		
	}

	@Override
	public void driveCar(int driveTimeInSecond) {
		runforseconds(driveTimeInSecond);
		
	}

	@Override
	public void addAmountOFFuel(int ammount) {
		addfuel(ammount);
		
	}

	@Override
	public int getmanufacturingYear() {
		
		return manufacturingYear;
	}

	@Override
	public String getCarModelName() {
		
		return getCarModelName();
	}

}
