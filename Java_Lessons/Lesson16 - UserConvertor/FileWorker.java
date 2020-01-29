import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWorker {
	public final static String FILE_PATH = "D:\\Raychenko\\Proj27\\users.json";

	public static String readData()
	{
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(new File(FILE_PATH)));

			String data = "";
			String line;
			while ((line = br.readLine()) != null) {
				data += line + "\r\n";
			}

			return data;

		} catch (Exception e) {
			return null;
		}
	}

	public static boolean write(String data)
	{
		BufferedWriter bw;
		try {
			bw = new BufferedWriter(new FileWriter(new File(FILE_PATH)));
			bw.write(data);
			bw.close();

			return true;
		} catch (IOException e) {
			return false;
		}

	}
}
