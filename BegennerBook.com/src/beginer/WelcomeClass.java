package beginer;



public class WelcomeClass {
	public String name;
	public String messageNumber;
	private String sender;
	
	public String getSender() {
		return sender;
	}


	public void setSender(String sender) {
		this.sender = sender;
	}


	public String sendingDate;


	public void printMessage() {
		System.out.println("Welcome To Java Programing");
		

	}
}
