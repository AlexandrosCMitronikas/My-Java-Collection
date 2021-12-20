package Shapes;

public class CalcShape {

	public static void main(String[] args) {
		Shape shape1 = new Rectangle1("blue", 3, 7);
		System.out.println(shape1);
		System.out.println("The total area of this rectangle is " + shape1.getArea() + "cm.");
		
		Shape shape2 = new Triangle1("pink", 5, 9);
		System.out.println(shape2);
		System.out.println("The total area of this triangle is " + shape2.getArea() + "cm.");

		Shape shape3 = new Circle1("yellow", 0, 13.1);
		System.out.println(shape3);
		System.out.println("The total area of this circle is " + String.format("%.3f", shape3.getArea()) + "cm.");
		
	}

}
