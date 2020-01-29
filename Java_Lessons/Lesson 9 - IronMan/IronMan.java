package Lesson15;

public class Ironman {

	public static void main(String[] agrs) {
		System.out.println("Start!");

		// Init Woman
		int numbersWoman = (int) (getNumbersHuman());
		Woman[] womans = new Woman[numbersWoman];
		for (int i=0; i < numbersWoman; i++) {
			womans[i] = new Woman();
		}

		// Init Man
		int numbersMan = getNumbersHuman();
		Man[] mans = new Man[numbersMan];
		for (int i=0; i < numbersMan; i++) {
			mans[i] = new Man();
		}

		Human[] sportsmans = new Human[numbersWoman + numbersMan];

		// Add womans to Start
		for (int i=0; i < womans.length; i++) {
			sportsmans[i] = womans[i];
		}

		// Add mans to Start
		for (int i=0; i < mans.length; i++) {
			sportsmans[womans.length + i] = mans[i];
		}

		int numberSitMan = 0;
		int numberRunMan = 0;
		int numberPoolUpMan = 0;

		int numberSitWoman = 0;
		int numberRunWoman = 0;
		int numberPoolUpWoman = 0;

		for (Human sportsman : sportsmans) {
			if (sportsman instanceof Man) {
				sportsman = (Man)sportsman;
				numberSitMan += sportsman.sit();
				numberRunMan += sportsman.run();
				numberPoolUpMan += sportsman.poolUp();
			} else {
				sportsman = (Woman)sportsman;
				numberSitWoman += sportsman.sit();
				numberRunWoman += sportsman.run();
				numberPoolUpWoman += sportsman.poolUp();
			}
		}

		System.out.println("Result:");
		System.out.println("womans = " + numbersWoman + ", mans = " + numbersMan);
		System.out.println("Womans: sit = " + numberSitWoman + ", run = " + numberRunWoman + ", poolUp = " + numberPoolUpWoman);
		System.out.println("Mans: sit = " + numberSitMan + ", run = " + numberRunMan + ", poolUp = " + numberPoolUpMan);

		if (numberSitWoman > numberSitMan) {
			System.out.println("Sit Woman WIN!");
		} else {
			System.out.println("Sit Man WIN!");
		}

		if (numberRunWoman > numberRunMan) {
			System.out.println("Run Woman WIN!");
		} else {
			System.out.println("Run Man WIN!");
		}

		if (numberPoolUpWoman > numberPoolUpMan) {
			System.out.println("PoolUp Woman WIN!");
		} else {
			System.out.println("PoolUp Man WIN!");
		}
	}

	public static int getNumbersHuman() {
		return (int)(7*Math.random() + 5);
	}

}
