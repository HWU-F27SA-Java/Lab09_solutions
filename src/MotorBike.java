package tutorial;

public class MotorBike extends MotoriseVehicle {
	public MotorBike() {
		this("", "");
	}
	
	public MotorBike(String brand, String make) {
		this(brand, make, new Motor());
	}
	
	public MotorBike(String brand, String make, int horsepower, int cc) {
		this(brand, make, new Motor(horsepower, cc));
	}
	
	public MotorBike(String brand, String make, Motor motor) {
		super(brand, make, motor);
		passenger = 2;
	}

	@Override
	public void drive() {
		System.out.println("Wrooooooom!");
	}
}
