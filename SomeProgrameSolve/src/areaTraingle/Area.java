package areaTraingle;

import java.util.Scanner;

public class Area {

	static Scanner mScanner = new Scanner(System.in);
	public static void main(String[] args) {
		
	      System.out.println("Enter the width of the Triangle:");
	      double base = mScanner.nextDouble();

	      System.out.println("Enter the height of the Triangle:");
	      double height = mScanner.nextDouble();
	      
	      double area = (base*height)/2;
	      
	      System.out.println("Area Of Triangle: "+area);
	      


	}

}
