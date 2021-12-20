package Shapes;

public class Rectangle1 extends Shape {

	private double length, width;

	public Rectangle1(String colour, int length, int width) {
		super(colour);
		this.length=length;
		this.width=width;
	}
	@Override
	public String toString() {
		return "Rectangle1 has a length of " + length + "cm, width of " + width + "cm " + super.toString();
	}
	
	@Override
	public double getArea() {
		return length*width;
	}
	
}
