package inheritance;

public class Account {
	private String name;
	private String number;
	private double balence;

	private Brance accountBrance;

	public Brance getAccountBrance() {
		return accountBrance;
	}

	public void setAccountBrance(Brance accountBrance) {
		this.accountBrance = accountBrance;
	}

	public void deposit(double amount) {
		
		balence += amount;
	}

	public String withdraw(double amount) {
		if (balence - amount >= 0) {
			balence -= amount;
			return "Done";
		} else {
			return "Insufficient Balence";
		}

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

}
