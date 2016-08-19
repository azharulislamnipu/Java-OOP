package areaOfCircle;

import java.util.Scanner;

public class Area {

	static Scanner mysScanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter Your Radius: ");
		double radius = mysScanner.nextDouble();

		MethodOfArea area = new MethodOfArea();
		// area.calculaArea(radius);
		// area.circumference(radius);

		System.out.println("The Area Of Circle: " + area.calculaArea(radius)
				+ "\nCircumference Of Circle: " + area.circumference(radius));

	}

}
