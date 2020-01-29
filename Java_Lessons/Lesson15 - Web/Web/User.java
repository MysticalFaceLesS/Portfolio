import java.util.ArrayList;

import org.json.JSONObject;

public class User {

	private String username;

	private String phone;

	private int age;

	private ArrayList<User> friends;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public ArrayList<User> getFriends() {
		return friends;
	}

	public void setFriends(ArrayList<User> friends) {
		this.friends = friends;
	}

	public String toString() {
		JSONObject userObject = new JSONObject(this);
		return userObject.toString();
	}
}