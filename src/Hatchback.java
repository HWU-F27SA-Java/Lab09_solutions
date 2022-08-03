package tutorial;

public class Hatchback extends Car {
	private static final int DOORS = 3;
	
	public Hatchback(String brand, String make, int horsepower, int cc) {
		super(brand, make, horsepower, cc, DOORS);
	}

	public String getDetails() {
		return "(Hatchback) " + super.getDetails();
	}
}
