package problem_1;

public class Sphere extends Shape3D {
	private double radius;
	
	@Override
	public double volume() {
		return (4 * Math.PI * Math.pow(radius, 3))/3;
	}

	@Override
	public double surfaceArea() {
		return 4 * Math.PI * Math.pow(radius, 2);
	}
	
}
