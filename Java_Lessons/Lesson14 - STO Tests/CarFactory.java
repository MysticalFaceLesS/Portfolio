import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

public class CarFactory {

	public static List<Car> getInstances(int number, Class cls) {
		List<Car> cars = new ArrayList<Car>();
		while (number > 0) {
			Constructor[] constructors = cls.getConstructors();
			Constructor c = constructors[0];
			try {
				cars.add((Car) c.newInstance());
			} catch (Exception e) {
				e.printStackTrace();
			}
			number--;
		}
		return cars;
	}

}
