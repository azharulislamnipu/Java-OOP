package areaOfRectangle;

import java.util.Scanner;

public class Area {

	static Scanner mScanner = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		System.out.println("Enter lenthOf Rectangle:");
		double length = mScanner.nextDouble();
		System.out.println("Enter widthOf Rectangle:");
		double width = mScanner.nextDouble();
		
		
		
		System.out.println("Area Of Rectangle: "+MethodOfArea.CalculateArea(length, width));

	}

}
