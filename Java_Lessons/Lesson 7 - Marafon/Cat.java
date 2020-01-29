
public class Cat extends Lesson13 {
	public int numberLife = 9;

	public int jump(int j){
		return 120;
	}

	/**
	 * @override
	 */
	public Integer run() {
		return (int) (50 * Math.random() + 20);
	}
}