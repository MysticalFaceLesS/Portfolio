
public class Ford extends Car{
	public Ford() {
		this.rpm = (int) ((Math.random() * 5000 + 3000));
		this.durability = 1.5 * Math.random();;
		this.numberFaults = (int) (Math.random() * 7 + 3);
	}
}
