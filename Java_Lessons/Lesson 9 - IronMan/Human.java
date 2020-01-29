package Lesson15;

abstract class Human implements RunInterface, PoolUpInterface, SitInterface {
	protected int numberRun = 10;

	protected int numberSit = 50;

	protected int numberPoolUp = 12;

	public int run() {
		return (int)(6 * Math.random() + (this.getNumberRun() - 3));
	}

	public int poolUp() {
		return (int)(8 * Math.random() + (this.numberRun - 4));
	}

	public int sit() {
		return (int)(20 * Math.random() + (this.numberRun - 10));
	}

	abstract int getNumberRun();
	abstract int getNumberSit();
	abstract int getNumberPoolUp();
}
