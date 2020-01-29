
public class User {

	public String nickname;
	private String password;

	public User(String nickname) {
		this.nickname = nickname;
		this.password = ((int) 10000 * Math.random() + 89999) + "";
	}

	public String getNickname() {
		return this.nickname;
	}

	public String getPassword() {
		return this.password;
	}

	public Boolean auth(String password) {
		return this.getPassword().equals(password);
	}
}
