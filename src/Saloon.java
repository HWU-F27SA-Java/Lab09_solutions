package tutorial;

public class Saloon extends Car {
	private static final int DOORS = 4;
	
	public Saloon(String brand, String make, int horsepower, int cc) {
		super(brand, make, horsepower, cc, DOORS);
	}

	public String getDetails() {
		return "(Saloon) " + super.getDetails();
	}
}
