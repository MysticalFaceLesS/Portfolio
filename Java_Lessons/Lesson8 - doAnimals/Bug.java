
public class Bug implements RunnableInterfase, SleepInterface {
	public void run() {
		System.out.println("Running very slow...");
	}

	public void sleep() {
		System.out.println("Sleeping...");
	}
}
