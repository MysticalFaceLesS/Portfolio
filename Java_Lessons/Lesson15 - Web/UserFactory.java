import org.json.JSONException;
import org.json.JSONObject;

public class UserFactory {

	public static User getInstance(JSONObject object) {
		try {
			String username = object.getString("username");
			String phone = object.getString("phone");
			int age = object.getInt("age");

			User user = new User();
			user.setUsername(username);
			user.setPhone(phone);
			user.setAge(age);

			return user;
		} catch (JSONException e) {
			System.err.println(e.getMessage());

			return null;
		}

	}

}