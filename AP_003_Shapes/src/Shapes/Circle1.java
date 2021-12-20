package Shapes;

public class Circle1 extends Shape{

	private double pi=3.14, r;

	public Circle1(String colour, double pi, double r) {
		super(colour);
		this.r=r;
	}
	
	@Override
	public String toString() {
		return "Circle has a radius of " + r + "cm " + super.toString();
	}
	
	@Override
	public double getArea() {
		return pi*r;
	}
}
