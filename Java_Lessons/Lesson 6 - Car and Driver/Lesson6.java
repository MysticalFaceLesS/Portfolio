public class Lesson6 {
	public static void main(String [] args) {
		String[] adrs = getAdrs();

		print(adrs);
	}

	public static String[] getAdrs() {
		String[] adrs = {"adr1", "adr2"};

		return adrs;
	}

	public static void print(String[] adrs) {
		for (String adr : adrs) {
			System.out.println(adr);
		}

		for (String adr : adrs) {
			System.out.println(adr);
		}

		int index = 0;
		do {
		    System.out.println(adrs[index]);
		    index++;
		} while (index < adrs.length);

		index = 0;
		while (index < adrs.length) {
			System.out.println(adrs[index]);
			index++;
		}
	}
}
