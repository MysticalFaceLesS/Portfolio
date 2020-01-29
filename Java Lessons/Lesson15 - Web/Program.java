import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Program {

	public static void main(String[] args) {

		String data = "{"
				+ "\"username\": \"Login123\","
				+ "\"phone\": \"077777777\","
				+ "\"age\": 32,"
				+ "\"friends\": ["
				+ "	{"
				+ "\"username\": \"Login444\","
				+ "\"phone\": \"077777773\","
				+ "\"age\": 33"
				+ "},"
				+ "{"
				+ "\"username\": \"Login555\","
				+ "\"phone\": \"077777775\","
				+ "\"age\": 35"
				+ "}"
				+ "]"
				+ "}";

		try {
			JSONObject jo = new JSONObject(data);

			UserConvertor convertor = new UserConvertor(jo);

			User user = UserFactory.getInstance(jo);
			ArrayList<User> userList = convertor.getArrayList("friends"); //new ArrayList<User>();
			user.setFriends(userList);

			System.out.println(user);

		} catch (JSONException e) {
			System.out.print(e.getMessage());
		}
	}
}