package tutorial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Random;

public class CarList {

	public static void main(String[] args) {
		Random rnd = new Random();

		ArrayList<Vehicle> vehicle = new ArrayList<Vehicle>();
		vehicle.add(new Hatchback("VW", "Polo", 90, 500));
		vehicle.add(new SUV("Mini", "Countryman", 130, 1000));
		vehicle.add(new Hatchback("Fiat", "Punto", 60, 400));
		vehicle.add(new Saloon("Skoda", "Fabia", 150, 1500));
		vehicle.add(new Bike("Mountain", "Bike"));
		vehicle.add(new MotorBike("Suzuki", "Hayabusa", 194, 1340));

		System.out.println(vehicle.get(0));
		System.out.println();

		ArrayList<String> plates = new ArrayList<String>();
		plates.add("dfs56461");
		plates.add("sdf654761");
		plates.add("wqa420");
		plates.add("wer46513");
		plates.add("jkl464");
		plates.add("uop1385");
		plates.add("cxf54561");
		plates.add("iol243");

		HashMap<String, Vehicle> register = new HashMap<>();

		for(Vehicle c : vehicle) {
			if(c instanceof MotoriseVehicle) {
				String plate;
				do {
					plate = plates.get(rnd.nextInt(plates.size()));
				} while(register.keySet().contains(plate));
				register.put(plate, c);
			}
		}

		for(String k : register.keySet()) {
			System.out.println(k + ": " + register.get(k));
		}

		System.out.println();

		for(Vehicle c : vehicle) {
			c.drive();
		}

		//		Iterator<Entry<String, Car>> it = register.entrySet().iterator();
		//		while(it.hasNext()) {
		//			Entry<String, Car> entry = it.next();
		//			System.out.println(entry.getKey() + ": " + entry.getValue().getDetails());
		//		}
	}

}
