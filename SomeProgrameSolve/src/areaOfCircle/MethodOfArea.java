package areaOfCircle;

public class MethodOfArea {
	
	public double calculaArea(double radius) {
		double area = Math.PI * (radius * radius);
		return area;
	}
	public double circumference(double radius) {
		double circumference= Math.PI * 2*radius;
		return circumference;
	}
}
