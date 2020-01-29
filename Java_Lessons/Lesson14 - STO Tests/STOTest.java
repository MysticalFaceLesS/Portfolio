import static org.junit.Assert.*;

import java.lang.reflect.Field;

import org.junit.Test;

public class STOTest {

	@Test
	public void testCheckMotor() {

		BMW car = new BMW();
		try {
			Field field = car.getClass().getDeclaredField("rpm");
			field.setAccessible(true);
			car.rpm = 4000;

			boolean result = STO.checkMotor(car);
			assertTrue(result);

			car.rpm = 1000;
			result = STO.checkMotor(car);
			assertFalse(result);

		} catch (Exception e) {}

	try {
		Field field = car.getClass().getDeclaredField("checkHull");
		field.setAccessible(true);
		car.durability = 5;

		boolean result = STO.checkHull(car);
		assertTrue(result);

		car.durability = 150;
		result = STO.checkHull(car);
		assertFalse(result);

	} catch (Exception e) {}

	try {
		Field field = car.getClass().getDeclaredField("checkElectronic");
		field.setAccessible(true);
		car.numberFaults = 0;

		boolean result = STO.checkElectronic(car);
		assertTrue(result);

		car.numberFaults = 6;
		result = STO.checkElectronic(car);
		assertFalse(result);

	} catch (Exception e) {}



 }
}
