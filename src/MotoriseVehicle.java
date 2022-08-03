package tutorial;

public abstract class MotoriseVehicle extends Vehicle {
	private Motor motor;
	
	public MotoriseVehicle() {
		this("", "");
	}
	
	public MotoriseVehicle(String brand, String make) {
		this(brand, make, new Motor());
	}
	
	public MotoriseVehicle(String brand, String make, int horsepower, int cc) {
		this(brand, make, new Motor(horsepower, cc));
	}
	
	public MotoriseVehicle(String brand, String make, Motor motor) {
		super(brand, make);
		this.motor = motor;
	}
	
	public int getHorsepower() {
		return motor.getHorsepower();
	}

	public void setHorsepower(int horsepower) {
		motor.setHorsepower(horsepower);
	}

	public int getCc() {
		return motor.getCc();
	}

	public void setCc(int cc) {
		motor.setCc(cc);
	}
	
	public String getDetails() {
		return super.getDetails() + getHorsepower() + "HP (" + getCc() + "cc)\n";
	}
}
