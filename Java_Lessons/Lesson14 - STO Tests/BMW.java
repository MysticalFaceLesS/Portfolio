
public class BMW extends Car {
	public BMW() {
		this.rpm = (int) (1.5 * (Math.random() * 7000 + 2000));
		this.durability = Math.random() * 1.5;
		this.numberFaults = (int) (Math.random() * 7 + 3);
	}
}
