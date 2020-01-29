import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class UserConvertor {

	private JSONObject object;

	public UserConvertor(Object object) {
		this.object = (JSONObject) object;
	}

	public String getString(String key) {
		try {
			return this.object.getString(key);
		} catch (JSONException e) {
			return null;
		}
	}

	public ArrayList<User> getArrayList(String key) {
		try {
			ArrayList<User> userList = new ArrayList<User>();

			JSONArray arr = this.object.getJSONArray(key);
			for (int i=0; i < arr.length(); i++) {
				User user = UserFactory.getInstance(arr.getJSONObject(i));
				userList.add(user);
			}
			return userList;
		} catch (JSONException e) {
			return null;
		}
	}

	public User getObject(String key) {
		try {
			return UserFactory.getInstance(this.object.getJSONObject(key));
		} catch (JSONException e) {
			return null;
		}
	}
}
