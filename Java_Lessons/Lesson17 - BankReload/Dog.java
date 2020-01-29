
public class Dog extends Animals {
	public String voice = "gav-gav!";
	public int run = 10;

	public int distance(int run) {
		int dist = (int) ((run + Math.random()) * 3);
		return dist;
	}
}
