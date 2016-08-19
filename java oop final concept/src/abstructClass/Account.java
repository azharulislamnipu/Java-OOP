package abstructClass;


public abstract class Account {

	private String name;
	private String number;
	private double balence;
	
	
	public void deposit(double amount) {
		balence += amount;
	}
	public void withdraw(double amount) {
		balence -= amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public double getBalence() {
		return balence;
	}
	
	public abstract void Transfer(String fromAccounNo, String toAccountNo);
}
