package Lesson13;

public class Marafon {
	public static void main(String[] args) {
		start();
	}

	public static void start() {

//		Cat murka = new Cat();
//		Cat barsik = new Cat();
//		Cat tomik = new Cat();
		Lesson13[] cats = getCommand("Cat", 12);

//		Dog rex = new Dog();
//		Dog bagira = new Dog();
		Lesson13[] dogs = getCommand("Dog", 10);

		System.out.println("Cats run!!!");
		int catsDistance = calcDistance(cats);

		System.out.println("Dogs run!!!");
		int dogsDistance = calcDistance(dogs);

		if(catsDistance > dogsDistance) {
			System.out.println("Cats WIN!!!");
		} else if (catsDistance < dogsDistance) {
			System.out.println("Dogs WIN!!!");
		} else {
			System.out.println("DRAW :)");
		}

		Lesson13[] animals = new Lesson13[4];

		animals[0] = cats[0];
		animals[1] = cats[3];
		animals[2] = dogs[2];
		animals[3] = dogs[1];

		int distance = 0;
		for (Lesson13 animal : animals) {
			distance += animal.run();
		}
		System.out.println("Distance = " + distance);
	}

	private static Lesson13[] getCommand(String className, int demantion) {
		Lesson13[] animals = new Lesson13[demantion];
		for (int i=0; i< animals.length; i++) {
			if (className.equals("Cat")) {
				animals[i] = new Cat();
			} else {
				animals[i] = new Dog();
			}
		}
		return animals;
	}

	private static int calcDistance(Lesson13[] animals) {
		int distance = 0;
		for (Lesson13 animal : animals) {
			distance += animal.run();
		}
		System.out.println("animals result = " + distance);

		return distance;
	}

}
