package Shapes;

public class Shape {
	
	private String colour;
	
	public Shape (String colour) {
		this.colour = colour;
	}
	
	@Override
	public String toString() {
		return "and the shape's colour is " + colour + ".";
	}
	
	public double getArea() {
		System.err.println("Shape unknown, cannot calculate area.");
		return 0;
	}

}
