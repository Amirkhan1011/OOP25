package task_1;

public abstract class Car {
	public String color;
	public String brand;
	public String model;
	public double fuelConsumption;
	
	public Car(String color, String brand, String model, double fuelConsumption) {
		this.color = color;
		this.brand = brand;
		this.model = model;
		this.fuelConsumption = fuelConsumption;
	}
	
	public abstract String getDriveType();
	
	public String toString() {
		return brand + ", " + model;
	}
}
