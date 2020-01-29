
public class Dog extends Animals {

	public String nickname = "doggy";
	public void run() {
		System.out.println("Dog running...");
	}

	public String getNickname() {
		return this.nickname;
	}
}
