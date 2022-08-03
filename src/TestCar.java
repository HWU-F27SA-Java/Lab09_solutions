package tutorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestCar {
	static Car car;
	
	@BeforeAll
	static void setup() {
		car = new Car();
	}

	@Test
	void testBrand() {
		String brand = "test_brand";
		car.setBrand(brand);
		assertEquals(brand, car.getBrand());
	}
	
	@Test
	void testMake() {
		String make = "test_make";
		car.setMake(make);
		assertEquals(make, car.getMake());
	}
	
	@Test
	void testHorsepower() {
		int hp = 5;
		car.setHorsepower(hp);
		assertEquals(hp, car.getHorsepower());
	}
	
	@Test
	void testCc() {
		int cc = 6;
		car.setCc(cc);
		assertEquals(cc, car.getCc());
	}
	
	@Test
	void testDoorsHatchback() {
		int doors = 3;
		assertEquals(doors, new Hatchback("", "", 0, 0).getDoors());
	}
	
	@Test
	void testDoorsSaloon() {
		int doors = 4;
		assertEquals(doors, new Saloon("", "", 0, 0).getDoors());
	}
	
	@Test
	void testDoorsSUV() {
		int doors = 5;
		assertEquals(doors, new SUV("", "", 0, 0).getDoors());
	}

}
