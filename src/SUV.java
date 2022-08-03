package tutorial;

public class SUV extends Car {
	private static final int DOORS = 5;
	
	public SUV(String brand, String make, int horsepower, int cc) {
		super(brand, make, horsepower, cc, DOORS);
	}
	
	public String getDetails() {
		return "(SUV) " + super.getDetails();
	}

}
