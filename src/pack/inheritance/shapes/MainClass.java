package pack.inheritance.shapes;

public class MainClass {

	public static void main(String[] args) {
		Shape shape = new Shape();
		System.out.println(shape.getArea());
		Circle circle = new Circle(10);
		System.out.println(circle.getArea());
		Rectangle rectangle = new Rectangle(5, 10);
		System.out.println(rectangle.getArea());
	}

}
