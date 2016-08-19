package inheritance;

public class SavingAccount extends Account{

	private double InterrestAmount;

	public double getInterrestAmount() {
		return InterrestAmount;
	}
	
	public void m1(){
		super.withdraw(5000); //super class
		withdraw(3000); //ownner
	}

	public String withdraw(double amount) {
		if (getBalence() - amount >= 0) {
			
			return super.withdraw(amount);
		} else {
			return "Insufficient Balence";
		}
	}
	public void setInterrestAmount(double interrestAmount) {
		InterrestAmount = interrestAmount;
	}
	
	
}
