package shikhok.com;

import java.util.Scanner;

public class TryCatch {

	static Scanner myScanner = new Scanner(System.in);
	public static void main(String[] args) {
		int userInput=0;
		try {
			
			pr("Please give a number:");
			userInput = myScanner.nextInt();
			while(userInput <50){
				prln(100/userInput);
				//pr("Please give a number:");
				//userInput = myScanner.nextInt();
				userInput++;
			}
			
		} catch (Exception unknownException) {
			unknownException.printStackTrace();
		}finally{
			prln("came out of try catch block");
		}

	}
	static void prln(Object anyObject){
		System.out.println(anyObject);
	}
	static void pr(Object anyObject){
		System.out.print(anyObject);
	}

}

