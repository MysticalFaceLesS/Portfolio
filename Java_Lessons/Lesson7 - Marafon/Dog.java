public class Dog extends Lesson13 {
	public int lvlFriend;

	public int getBiteLevel() {
		return 15;
	}
	/**
	 * @override
	 */

	public Integer run() {
		return (int) (70 * Math.random() + 20);
	}
}
