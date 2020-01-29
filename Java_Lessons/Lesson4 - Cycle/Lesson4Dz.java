import java.util.Arrays;

public class Lesson4Dz {
	
	public static void main(String[] args) {
		
		Arrays.sort(names);
		
		for (String element : names) {
				System.out.println(element);
		};

	}
	
	public static String[] CreateNames(String Name) {
		
		String[] names = new String[] {"Henry", "Den", "Jack", "Anya"};
		
		return names;
	}
}