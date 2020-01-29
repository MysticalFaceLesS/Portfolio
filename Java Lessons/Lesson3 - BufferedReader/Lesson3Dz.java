	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.File;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.io.InputStreamReader;

	public class Lesson3Dz {

		final static String path = "D:\\Lessons\\source\\";
		final static String fileName = "questions.txt";
		final static String questions = "Questions1?\r\nQuestion2?\r\nQuestion3?";

		public static void main(String[] args) {

			// Init questions
			setContent(path + fileName, questions);

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] questionsArray = getContentFromFileAsArray(path + fileName);

			String answer = "";
			String allAnswers = "";

			do {
				// Print random question
				System.out.println(getRandomQuestion(questionsArray));
				try {
					answer = br.readLine();
					allAnswers += answer + "\r\n";
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} while (!answer.equals("exit"));

			// Save all answers to File
			setContent(path + "answers.txt", allAnswers);
		}

		public static String getRandomQuestion(String[] questions) {
			int indexRandomQuest = (int) (Math.random() * questions.length);

			return questions[indexRandomQuest];
		}

		public static void print(String[] strs) {
			for (String s1 : strs) {
				System.out.println(s1);
			}
		}

		public static String[] getContentFromFileAsArray(String fileName) {
			String[] questAsArray = new String[3];
			try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
				String s;
				int i = 0;
				while ((s=br.readLine()) != null) {
					questAsArray[i] = s;
					i++;
				}
			} catch (IOException e) {}

			return questAsArray;
		}

		public static void setContent(String fileName, String content) {
			File file = new File(fileName);

			if (!file.exists()) {
				try {
					file.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
				bw.write(content);
			} catch (IOException e) {}
		}

	}
