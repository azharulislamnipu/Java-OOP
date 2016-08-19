package dataprivate;


public class AccountClass {

	private String name;
	private String accountNumber;
	private String mobileNumber;
	private String openingDateString;
	private double balence=0;
	
	public void setName(String name) {
		if(name.length()>=2){
			this.name = name;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getOpeningDateString() {
		return openingDateString;
	}

	public void setOpeningDateString(String openingDateString) {
		this.openingDateString = openingDateString;
	}

	public double getBalence() {
		return balence;
	}

	public void deposit(double amount) {
		 balence += amount;
	}
	public double withdraw(double amount) {
		
		return balence -= amount;
	}
	
}
