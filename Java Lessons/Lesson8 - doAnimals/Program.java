
public class Program {
	public static void main(String[] args) {
//		Dog dog = new Dog();
//		dog.run();
//		System.out.println("Nickname = " + dog.nickname);

		RunnableInterfase[] animals = {new Dog(), new Cat()};
		Program program = new Program();

		for (RunnableInterfase animal : animals) {
			program.runDistance(3, animal);
		}
	}

	public void runDistance(int distance, RunnableInterfase animals) {
		for (int i=0; i < distance; i++) {
			animals.run();
		}
	}
}
