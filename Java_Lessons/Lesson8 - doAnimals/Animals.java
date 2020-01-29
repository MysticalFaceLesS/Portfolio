
abstract class Animals implements RunnableInterfase, SleepInterface {

	public String nickname = "unknown nickname";

	public void run() {
			System.out.println("Running...");
	}

	public String getNickname() {
		return this.nickname;
	}

	public void sleep() {
		System.out.println("Sleeping...");
	}
}
