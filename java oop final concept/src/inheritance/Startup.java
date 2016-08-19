package inheritance;

import java.util.ArrayList;

public class Startup {

	public static void main(String[] args) {

		Brance br1 = new Brance();
		Account account = new Account();
		account.setAccountBrance(br1);
		account.getAccountBrance();

		SavingAccount sv1 = new SavingAccount();
		sv1.setName("Azharul");
		sv1.setNumber("1234-1234124");	
		sv1.setInterrestAmount(500);
		sv1.deposit(10000);
		sv1.withdraw(2000);
		double balance = sv1.getBalence();

		CheckingAccount chk1 = new CheckingAccount();
		chk1.setName("Alamin");
		chk1.setNumber("872-1281273812");
		chk1.setServiceCharge(1000);
		chk1.deposit(20000);
		chk1.withdraw(6000);
		double balance1 = chk1.getBalence();

		prln("AccounterName:" + sv1.getName() + "\nAccount Number: "
				+ sv1.getNumber() + "\nInterestAmount: "
				+ sv1.getInterrestAmount() + "\nAccountBrance: "
				+ sv1.getAccountBrance() + "\nBalence: " + balance);
		prln("\n\nFor Checking Account\n");
		prln("AccounterName:" + chk1.getName() + "\nAccount Number: "
				+ chk1.getNumber() + "\nServiceCharge: "
				+ chk1.getServiceCharge() + "\nAccountBrance: "
				+ chk1.getAccountBrance() + "\nBalence: " + balance1);
		
		Account acc1 = new SavingAccount(); //refernce superclass account
//		Account cck1 = new CheckingAccount();
//		Account acc11 = new Account();
		
		
		SavingAccount ssv1 = (SavingAccount)acc1; // reference subclass casting from super classs
		ssv1.setInterrestAmount(6677);
		
		ArrayList<Account> accountlist = new ArrayList<Account>();
		accountlist.add(account);
		accountlist.add(sv1);
		accountlist.add(chk1);
		
		for(Account anAccount: accountlist){
			anAccount.withdraw(12000);
		}
		
	}

	static public void prln(Object anyObject) {
		System.out.println(anyObject);
	}

}
