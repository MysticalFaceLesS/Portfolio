
public class ChildFactory {

	public static Child getInstance() {
		int r = (int) (Math.random() * 1000 + 2000);
		return r % 2 == 0 ? new Sun() : new Doughter();
  }
}
