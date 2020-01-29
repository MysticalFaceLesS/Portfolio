import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class STO {

	public static int numberCars = 10;

	public static void main(String[] args) {

		List<Car> cars = CarFactory.getInstances(numberCars, Honda.class);
		cars.addAll(CarFactory.getInstances(numberCars, BMW.class));
		cars.addAll(CarFactory.getInstances(numberCars, Ford.class));

		Map<String, Integer> statistic = new HashMap<String, Integer>();
		statistic.put(Honda.class.getName(), 0);
		statistic.put(BMW.class.getName(), 0);
		statistic.put(Ford.class.getName(), 0);

		for (Car car : cars) {
			String mark = car.getClass().getName();
			int numberByMark = statistic.get(mark);
			if (checkMotor(car) && checkHull(car) && checkElectronic(car)) {
				numberByMark++;
			}
			statistic.put(car.getClass().getName(), numberByMark);
		}

		System.out.println("Stop");
	}

	public static boolean checkMotor(Car car) {
		return isInRange(car.getRpm(), 2000, 5000);
	}

	public static boolean checkHull(Car car) {
		return isInRange((int) (100 * car.getDurability()), 10, 100);
	}

	public static boolean checkElectronic(Car car) {
		return isInRange(car.getNumberFaults(), 0, 5);
	}

	private static boolean isInRange(int value, int minValue, int maxValue) {
		if (value >= minValue && value <= maxValue) return true;
		return false;
	}
}
