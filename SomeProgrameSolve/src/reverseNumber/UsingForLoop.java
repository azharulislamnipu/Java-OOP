package reverseNumber;

import java.util.Scanner;

public class UsingForLoop {

	static Scanner mScanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		int num=0;
		int reverseNumber=0;
		
		prln("Enter Your Checking Number:");
		num = mScanner.nextInt();
		
		for ( ;num != 0; ) {
		
			reverseNumber = reverseNumber *10;
			reverseNumber = reverseNumber + num%10;
			num = num/10;
			
		}
		prln("ReverseNumber: "+reverseNumber);
		
	}
	public static void prln(Object anyObject) {
		System.out.println(anyObject);
	

	}

}
