package tutorial;

public class Car extends MotoriseVehicle {
	private int doors;
	
	public Car() {
		this("", "", new Motor());
	}
	
	public Car(String brand, String make, int horsepower, int cc) {
		this(brand, make, new Motor(horsepower, cc));
	}
	
	public Car(String brand, String make, int horsepower, int cc, int doors) {
		this(brand, make, new Motor(horsepower, cc), doors);
	}
	
	public Car(String brand, String make, Motor motor) {
		this(brand, make, motor, 0);
	}
	
	public Car(String brand, String make, Motor motor, int doors) {
		super(brand, make, motor);
		this.doors = doors;
		passenger = 5;
	}
	
	public int getDoors() {
		return doors;
	}
	
	public String getDetails() {
		return super.getDetails() + "Doors: " + getDoors();
	}

	@Override
	public void drive() {
		System.out.println("Wroom Wroom!");
	}
}
