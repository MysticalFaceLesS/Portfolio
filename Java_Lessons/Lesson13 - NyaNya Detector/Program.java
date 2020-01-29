import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Program {

	static int maxDistance;
	static int maxMinutes;

	public static void main(String[] args) {

		globalInit();

		List<Child> children = new ArrayList<Child>();
		int numberChildren = getRandValue(10, 20);
		int i = 0;
		while (i < numberChildren) {
			Child child = ChildFactory.getInstance();
			children.add(child);
			i++;
		}

		for (Child child : children) {
			int distance = child.move();
			int minutes = child.spendTime();
			if (distance > maxDistance) {
				System.err.println("NYANYA!!!! " + child.getName() + " have distance " + distance);
			}
			if (minutes > maxMinutes) {
				System.err.println("NYANYA!!!! " + child.getName() + " have time " + minutes);
			}
			System.out.println("Name: " + child.getName() + ", distance - " + distance + ", time - " + child.spendTime());
		}
	}

	public static void globalInit() {
		Doughter doughter = new Doughter();
		Method[] methods = doughter.getClass().getDeclaredMethods();
		for (Method m : methods) {
			if (m.isAnnotationPresent(NyanyaDistanceControl.class)) {
				NyanyaDistanceControl a = m.getDeclaredAnnotation(NyanyaDistanceControl.class);
				maxDistance = a.distance();
			}
			if (m.isAnnotationPresent(NyanyaTimeControl.class)) {
				NyanyaTimeControl a = m.getDeclaredAnnotation(NyanyaTimeControl.class);
				maxMinutes = a.minutes();
			}
		}
		System.out.println(maxDistance + ", " + maxMinutes);
	}

	public static int getRandValue(int min, int interval) {
		return (int) (Math.random() * interval + min);
	}

}
