import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class CarFactoryTest {

	@Test
	public void testGetInstances() {
		List<Car> cars = CarFactory.getInstances(3, Honda.class);
		assertEquals(cars.size(), 3);
		assertTrue(cars.get(0) instanceof Honda);
		assertTrue(cars.get(1) instanceof Honda);
		assertTrue(cars.get(2) instanceof Honda);
		assertFalse(cars.get(2) instanceof BMW);

		cars = CarFactory.getInstances(3, BMW.class);
		assertEquals(cars.size(), 3);
		assertTrue(cars.get(0) instanceof BMW);
		assertTrue(cars.get(1) instanceof BMW);
		assertFalse(cars.get(1) instanceof Ford);

		cars = CarFactory.getInstances(3, Ford.class);
		assertEquals(cars.size(), 3);
		assertTrue(cars.get(0) instanceof Ford);
		assertTrue(cars.get(1) instanceof Ford);

	}

}
