package beginer;

public class MyClass {

	public static void main(String[] args) {

		WelcomeClass welcomeClass = new WelcomeClass();
		welcomeClass.printMessage();
		welcomeClass.name = "welcome";
		welcomeClass.messageNumber = "01987234123";
		welcomeClass.setSender("Asik");
		welcomeClass.sendingDate = "12-aug-2015";
		
		for(int i=0; i<10;i++){

		System.out.println(welcomeClass.name + "\n"
				+ welcomeClass.messageNumber + "\n" + welcomeClass.getSender()
				+ "\n" + welcomeClass.sendingDate);

		}
	}

}
