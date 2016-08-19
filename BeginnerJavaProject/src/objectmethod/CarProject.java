package objectmethod;

public class CarProject {

	

	//static private CarClass ourCar = new CarClass();
	static private CarClass anotherCar;
	public static void main(String[] args) {

		SubCarClass ourSubCar= new SubCarClass("BMW", "7series", "xman", 3000, 50, 100, "Black");
		
		CarClass thirdCar = new CarClass("Mazda", "Axela", "nipu", 2000, 500);
		anotherCar = new CarClass("ToYOTA","Alione","azhar",1500,30);

		anotherCar.PrintAllInfo();

		thirdCar.PrintAllInfo();

		ourSubCar.PrintAllInfo();
		
		
	}

}
