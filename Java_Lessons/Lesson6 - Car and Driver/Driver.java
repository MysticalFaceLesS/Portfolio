
public class Driver {
	public String name;
	public int age;

	public Driver() {
		System.out.println("Init null");
	}

	public Driver(String name) {
		this.name = name;
		System.out.println("Init Name");
	}

	public Driver(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Init Name and age");
	}

	public String toString() {
		return "Name = " + this.name + ", age = " + this.age;
	}
}
