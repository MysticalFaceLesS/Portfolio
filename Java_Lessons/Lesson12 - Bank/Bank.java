import java.util.ArrayList;
import java.util.HashMap;

public class Bank {

	private ArrayList<User> clients;
	private HashMap<String, Double> deposits;

	public Bank() {
		clients = new ArrayList<User>();
		deposits = new HashMap<String, Double>();
		for (int i=0; i < 11; i++) {
			User user = new User("user" + i);
			double sum = 10000 * Math.random() + 10000;
			clients.add(user);
			deposits.put(user.getNickname(), sum);
		}
	}

	public double getCash(String nickname, String password, double sum) throws Exception {
		User user = this.findUserbyNickname(nickname);
		if (!user.auth(password)) {
			throw new Exception("No permission");
		}
		if (!(user instanceof User)) {
			throw new Exception("Not found User");
		}
		double balance = deposits.get(user.getNickname());
		if (balance < sum) {
			throw new Exception("Not have money!!!");
		}

		deposits.put(user.getNickname(), balance - sum);

		return sum;
	}

	public User findUserbyNickname(String nickname) {
		for (User user : clients) {
			if (user.getNickname().equals(nickname)) {
				return user;
			}
		}
		return null;
	}
}
