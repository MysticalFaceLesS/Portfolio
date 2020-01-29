
abstract class Car {

	protected int rpm;
	protected  double durability = Math.random();
	protected int numberFaults = (int) (10 * Math.random() * 1);

	//[0.5, 1,5]
	protected double quality;

	public int getRpm() {
		return this.rpm;
	}

	public double getDurability() {
		return this.durability;
	}

	public int getNumberFaults() {
		return this.numberFaults;
	}
}
