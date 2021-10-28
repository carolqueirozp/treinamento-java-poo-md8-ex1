package entities;

public class Rectangle {

	public double width;
	public double height;
	
	public Double area() {
		return width * height;
	}
	
	public Double perimeter() {
		return (width * 2) + (height * 2);
	}
	
	public Double diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height,2));
	}
	
	public String toString() {
		return "AREA: " + String.format("%.2f%n", area())
				+ "PERIMETER: " + String.format("%.2f%n", perimeter())
				+ "DIAGONAL: " + String.format("%.2f%n", diagonal());
	}
}
