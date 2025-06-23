package problem_1;

public class Cylinder extends Shape3D {
	private double radius, height;
	
	public Cylinder(double r, double h) {
		radius = r;
		height = h;
	}
	
	@Override
	public double volume() {
		return Math.PI * Math.pow(radius, 2) * height;
	}

	@Override
	public double surfaceArea() {
		return 2 * Math.PI * radius * (radius + height);
	}

}
