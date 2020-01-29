import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson5 {

	private static String pathToQuestionsFile = "D:\\Raychenko\\files\\Questions.txt";
	private static String pathToAnswersFile = "D:\\Raychenko\\files\\Answers.txt";

	public static void main(String[] args){

		String[] answers = new String[3];
		String[] questions = getQuestions();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int step = 0;
			for (String question : questions) {
				System.out.println(question);
				answers[step] = br.readLine();
				step++;
			}

			saveAnswers(answers);
			printArray(answers);
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
	}

	public static void CreateFile() {
		String path = "D:" + File.separator + "Raychenko" + File.separator + "Answers.txt";
		// Use relative path for Unix systems
		File f = new File(path);

		f.getParentFile().mkdirs();
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void printArray(String[] answers) {
		for (String answer : answers) {
			System.out.println(answer);
		}
	}

	public static String[] getQuestions() {
		String[] result = new String[3];

		try (BufferedReader br = new BufferedReader(new FileReader(pathToQuestionsFile))) {
			String question;
			int step = 0;
			while ((question=br.readLine()) != null) {
				result[step] = question;
				step++;
			 }
			} catch (IOException e) {
		}
		return result;
	}

	public static void saveAnswers(String[] answers) {
		String answersAsString = "";
		try(BufferedWriter bw = new BufferedWriter(new FileWriter (pathToAnswersFile))) {
			for (String answer : answers) {
				answersAsString += answer + "\r\n";
			}
			bw.write(answersAsString);
		} catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
