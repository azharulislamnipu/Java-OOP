package dataprivate;

import java.util.Scanner;

import dataprivate.AccountClass;



public class Startup {



	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		
		AccountClass accountClass = new AccountClass();
		String Name = input.nextLine();
		accountClass.setName(Name);
		
		accountClass.setMobileNumber("01986926212");
		accountClass.setOpeningDateString("19-Augost-2015");
		accountClass.setAccountNumber("111-23344123");
		
		accountClass.deposit(5000);
		double amount = accountClass.withdraw(2000);
		accountClass.deposit(5000);
	
		prln("Name: "+accountClass.getName()+"\nAccount No: "+accountClass.getAccountNumber()+"\nMobile Number: "+accountClass.getMobileNumber()+"\nOpeningDate: "+accountClass.getOpeningDateString());
		prln("My Total Balence: "+accountClass.getBalence());
		
		prln("Deposit Balence: "+amount);
		
		
		AccountClass accountClass2 = accountClass;
		accountClass =null;
		accountClass2.setName("nipu");
		String name = accountClass2.getName();
		prln("Refernec By :"+name);
		
		
	}
	
	 static public void prln(Object anyObject) {
		System.out.println(anyObject);
	}

}
