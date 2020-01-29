import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Town {

	public static final int speed = 80;

	public static void main(String[] args) {
//		ArrayList<Driver> drivers = getDrivers();
//		HashMap<String, Integer> crimes = defineCrimes(getDrivers());
		displayCrimes(defineCrimes((getDrivers())));
	}

	public static ArrayList<Driver> getDrivers() {
		int numberDrivers = (int) (10 * Math.random() + 10);
		ArrayList<Driver> drivers = new ArrayList<Driver>();

		for (int i=0; i < numberDrivers; i++) {
			drivers.add(new Driver("number" + i));
		}

		return drivers;
	}

	public static HashMap<String, Integer> defineCrimes(ArrayList<Driver> drivers) {
		HashMap<String, Integer> crimes = new HashMap<String, Integer>();

		for (Driver driver : drivers) {
			if (driver.speed > Town.speed) {
				crimes.put(driver.number, driver.speed);
			}
		}
		return crimes;
	}

	public static void displayCrimes(HashMap<String, Integer> crimes) {
		for (Entry<String, Integer> entry : crimes.entrySet()) {
			String number = entry.getKey();
			Integer speed = entry.getValue();
			System.out.println(number + " = " + speed);
		}
	}
}