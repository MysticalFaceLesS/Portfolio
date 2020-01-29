
public class MyClass {

	private String name = "Olya";

	public int number = 33;

	public MyClass(String name) {
		this.name = name;
	}

	public MyClass(String name, int number) {
		this.name = name + "-2";
		this.number = number;
	}

	public String getName() {
		return this.name;
	}

	public int getNumber() {
		return this.number;
	}

	public void printData() {
		System.out.println(number + " " + name);
	}
}