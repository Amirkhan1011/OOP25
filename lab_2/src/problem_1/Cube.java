package problem_1;

public class Cube extends Shape3D {
	private double length;

	@Override
	public double volume() {
		return Math.pow(length, 3);
	}

	@Override
	public double surfaceArea() {
		return 6 * Math.pow(length, 2);
	}
	
}
