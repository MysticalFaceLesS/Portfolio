
public class LessonCar {

	public static void main(String[] args) {
		Driver driver = new Driver("Olya");
		driver.age = 19;

		Driver driver2 = new Driver("Vitya");
		driver2.age = 21;

		Car car = new Car(120, 1.5, "AA4444F", driver);
		car.setDriver(driver2);
		
//		System.out.println(driver.toString());
		System.out.println(car.toString());
	}

}
