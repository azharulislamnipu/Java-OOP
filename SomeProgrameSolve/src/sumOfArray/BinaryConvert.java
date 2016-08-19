package sumOfArray;

import java.util.Scanner;

public class BinaryConvert {

	static Scanner mScanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Your Binry Number: ");
		String desimal = mScanner.nextLine();
		
		System.out.println("In DesimalNumber: "+Integer.parseInt(desimal,2));

	}

}
