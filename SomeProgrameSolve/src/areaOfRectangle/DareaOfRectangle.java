package areaOfRectangle;

import java.util.Scanner;

public class DareaOfRectangle {

	static Scanner mScanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter lenthOf Rectangle:");
		double length = mScanner.nextDouble();
		System.out.println("Enter widthOf Rectangle:");
		double width = mScanner.nextDouble();
		
		double area = length*width;
		
		System.out.println("Area of Rectangle:"+area);

	}

}
