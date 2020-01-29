import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NewsService {
	public static final String filePath = "D:\\Programm\\eclipse-workspace\\web\\web_news\\news.txt";

	public void save(News news) {
		File file = new File(UserService.filePath);
		try (FileWriter fw = new FileWriter(file); BufferedReader  fr = new BufferedReader(new FileReader(file))) {
			fw.append(news.toString());
			fw.append("\r\n");
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

	public News parse() {

		File file = new File(UserService.filePath);

		try (BufferedReader  fr = new BufferedReader(new FileReader(file))) {
			String content = "";
			String line;
			while ((line = fr.readLine()) != null) {
				content += line + "\r\n";
			}

			String[] data = content.split(",");

			return new News(data[0], (data[1]), data[2], data[3]);

		} catch (IOException e) {
			System.err.println(e.getMessage());
		}

		return null;
	}

}
