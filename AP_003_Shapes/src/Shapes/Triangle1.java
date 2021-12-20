package Shapes;

public class Triangle1 extends Shape {

	private double base, height;
	
	public Triangle1(String colour, int base, int height) {
		super(colour);
		this.base=base;
		this.height=height;
	}
	
	@Override
	public String toString() {
		return "Triangle1 has a base= " + base + "cm, a height of " + height + "cm, " + super.toString();
	}
	
	@Override
	public double getArea() {
		return base*height/2;
	}
}
