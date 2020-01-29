
abstract class Child implements MoveInterface, TimerInterface {

	private static int indexChild = 1;

	private String name;

	public Child() {
		this.name = "Name" + indexChild;
		indexChild++;
	}

	@NyanyaDistanceControl(distance=300)
	public int move() {
		return (int) (Math.random() * 500 + 20);
	}

	@NyanyaTimeControl(minutes=90)
	public int spendTime() {
		return (int) (Math.random() * 60 + 60);
	}

	public String getName() {
		return this.name;
	}

}
