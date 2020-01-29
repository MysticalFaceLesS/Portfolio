
public class Honda extends Car {
	public Honda() {
		this.rpm = (int) ((Math.random() * 4000 + 3000));
		this.durability = 0.5 * Math.random();
		this.numberFaults = (int) (0.5 * (Math.random() * 7 + 3));
	}
}