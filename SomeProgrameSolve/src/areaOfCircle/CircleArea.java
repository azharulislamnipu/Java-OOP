package areaOfCircle;

import java.util.Scanner;

public class CircleArea {

	static Scanner mScanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter Your Radius: ");
		double radius = mScanner.nextDouble();

		double area = Math.PI * (radius * radius);

		System.out.println("Araea oF CirCle: " + area);

		double circumference = Math.PI * 2 * radius;

		System.out.println("Circumference OF Circle: " + circumference);

	}

}
