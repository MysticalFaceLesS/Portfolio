public class Driver {
	public int speed = 70;
	public String number;

	public Driver(String number) {
		this.number = number;
		this.speed = CheckSpeed();
	}

	public Integer CheckSpeed() {
		return (int) (speed * Math.random() + 50);
	}


	public String toString() {
		return "[" + this.number + " " + CheckSpeed() + "]";
	}

}
