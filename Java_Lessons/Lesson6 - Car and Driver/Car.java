
public class Car {
	public int speed = 80;

	public double weight;

	public String number;

	public Driver[] driver;

	public int indexDriver = 1;

	public Car() {

//		System.out.println("INIT EMPTY OBJECT");
	}

	public Car(int s, double w, String n) {
		this.speed = s;
		this.weight = w;
		this.number = n;
//		System.out.println("INIT OBJECT");
	}

	public Car(double w, String n) {
		this.weight = w;
		this.number = n;
//		System.out.println("INIT OBJECT WITHOUT SPEED");
	}

	public Car(String n) {
		this.number = n;
//		System.out.println("INIT OBJECT WITHOUT SPEED");
	}

	public Car(int s, double w, String n, Driver driver) {
		this.speed = s;
		this.weight = w;
		this.number = n;
		setDriver(driver);
//		System.out.println("INIT OBJECT");
	}

	public void setDriver(Driver newDriver) {
//		Driver[] newDrivers = new Driver[this.driver != null ? this.driver.length + 1 : 1];
		Driver[] newDrivers = new Driver[this.driver != null ? this.driver.length + 1 : 1];
		int index = 0;
		if (this.driver != null) {
		for (Driver driver : this.driver) {
			newDrivers[index++] = driver;
	    	}
	    }
		newDrivers[newDrivers.length - 1] = newDriver;
		this.driver = newDrivers.clone();
	}

	public String toString() {
		String strDrivers = "[";
		for (Driver d : this.driver) {
			strDrivers += d.toString();
		}
		strDrivers += "]";

		return "{speed = " + this.speed + ", weight = " + this.weight +
				", number = " + this.number + ", driver = " + strDrivers + "}";

	}
}
