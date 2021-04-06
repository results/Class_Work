package pack.inheritance.shapes;

public class Circle extends Shape {
	
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		double area = 3.14* radius * radius;
		return area;
	}

}
