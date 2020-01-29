package Lesson14;

public class Work {

	public static void main(String[] args) {
		String[] names = getNames();
		consol(names);
	}

	public static String[] getNames() {
		String[] names  = new String[] {"Henry", "Den", "Jack", "Anya"};

		return names;
	}

	public static void consol(String[] names) {

		for (String element : names) {
				System.out.println(element);
		}
	}

}
