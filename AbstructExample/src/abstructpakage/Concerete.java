package abstructpakage;

public class Concerete {

	public void anotherMethod() {
		System.out.println("I am another method odf conrete class");
	}
	public static void main(String[] args) {
	
	 //	AbstructDemo aDemo = new AbstructDemo() ;
		//abstract class can't create object 
		// if method is abstract than class must be abstract
		// class is abstract if method is not abstract it will be done
		//Abstract class can have both abstract and concrete methods
		DemoClass dc = new DemoClass();
		dc.anotherMethod();
		dc.disply();
	}

}
