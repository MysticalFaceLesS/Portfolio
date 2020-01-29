import java.util.Arrays;

public class LessonDz {

	public static void main(String[] args) {
	
		String[] names  = new String[] {"Henry", "Den", "Jack", "Anya"};
		
		Arrays.sort(names);
		
		for (String element : names) {
				System.out.println(element);
		};
  }
}