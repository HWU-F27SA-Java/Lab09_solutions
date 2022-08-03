package tutorial;

public abstract class Vehicle {
	protected int passenger;
	private String make, brand;
	
	public Vehicle() {
		this("", "");
	}
	
	public Vehicle(String brand, String make) {
		this.brand = brand;
		this.make = make;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	
	public String getDetails() {
		return getBrand() + " - " + getMake() + " #passengers: "+ passenger + "\n";
	}
	
	public abstract void drive();
	
	public String toString() {
		return getDetails();
	}
}
