

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/user")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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

			UserConvertor convertor = new UserConvertor(new JSONObject(data));

			User user = UserFactory.getInstance(new JSONObject(data));
			ArrayList<User> userList = convertor.getArrayList("friends");
			user.setFriends(userList);

			response.getWriter().write(user.toString());

		} catch (Exception e) {

		}


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String body = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));

		try {
			JSONObject userObj = new JSONObject(body);

			BufferedWriter bw = new BufferedWriter(new FileWriter(new File("D:\\Shevchenko\\Project27\\users.json")));
			bw.write(userObj.getJSONObject("user").toString());
			bw.close();

			response.getWriter().write("{\"result\": \"OK\"}");

		} catch (JSONException e) {
			response.getWriter().write("{\"result\": \"Error\"}");
		}
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String body = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));

		try {
			JSONObject userObj = new JSONObject(body);

			BufferedWriter bw = new BufferedWriter(new FileWriter(new File("D:\\Shevchenko\\Project27\\users.json")));
			bw.write(userObj.getJSONObject("user").toString());
			bw.close();

			response.getWriter().write("{\"result\": \"OK\"}");

		} catch (JSONException e) {
			response.getWriter().write("{\"result\": \"Error\"}");
		}
	}


}
