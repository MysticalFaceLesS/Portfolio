import java.lang.reflect.Field;
import java.util.ArrayList;

public class Programm {
	public static void main(String[] args) {
		try {

			Bank bank = new Bank();

			double kopilka = 0.0;

			ArrayList<User> clients = null;

			Field clientsField = bank.getClass().getDeclaredField("clients");
			clientsField.setAccessible(true);
			clients = (ArrayList<User>) clientsField.get(bank);

			for (User user : clients) {

				Field passwordField = user.getClass().getDeclaredField("password");
				passwordField.setAccessible(true);
				String password = (String) passwordField.get(user);

				while (true) {
					try {
						kopilka += bank.getCash(user.getNickname(), password, 1.0);
					} catch (Exception e) {
						break;
					}
				}
			}

			System.out.println("My money = " + kopilka);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
