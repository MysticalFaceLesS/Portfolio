public class User {

	public String name;

	public int age;

	public String phone;

	public String email;

	public User() {

	}

	public User(String name, int age, String phone, String email) {
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public String toString() {
		return name + "," + age + "," + phone + "," + email;
	}

}