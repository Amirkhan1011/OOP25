package task_1;

public class Sedan extends Car implements Vehicle {

	public Sedan(String color, String brand, String model, double fuelConsumption) {
		super(color, brand, model, fuelConsumption);
	}

	@Override
	public void move() {
		System.out.println("Sedan is driving on the road...");
	}

	@Override
	public String getType() {
		return this.getClass().getSimpleName();
	}
	
	@Override
	public String getDriveType() {
		return "Front-wheel drive";
	}
	
}
