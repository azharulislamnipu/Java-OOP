package reverseNumber;

import java.util.Scanner;

public class Recursion {

	static Scanner inputScanner = new Scanner(System.in);
	public static void main(String[] args) {
		int num;
		prln("Enter Your Checking Number:");
		num = inputScanner.nextInt();
		
		prln("Reverse Number Is: ");
//		RecursionClass recursionClass = new RecursionClass();
//		recursionClass.recursive(num);  
		
		RecursionClass.recursive(num);
		prln("");

	}
	
	public static void prln(Object anyObject) {
		System.out.println(anyObject);
	

	}

}
