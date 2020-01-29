package Dz13;

public class Rally extends Transport {
	public static void main(String[] args) {
	  start();
	}

	public static void start() {

		Transport[] car = getCommand("Car", 1);

		Transport[] buss = getCommand("Buss", 1);

		Transport[] moto = getCommand("Moto", 1);

		System.out.println("Car");
		int carDistance = calcDistance(car);

		System.out.println("Buss");
		int bussDistance = calcDistance(buss);

		System.out.println("Moto");
		int motoDistance = calcDistance(moto);

		if(carDistance > bussDistance || carDistance > motoDistance) {
			System.out.println();
			System.out.println("Car WIN!!!");
		} else if (carDistance < bussDistance || bussDistance > motoDistance) {
			System.out.println();
			System.out.println("Buss WIN!!!");
		} else {
			System.out.println(carDistance < carDistance || motoDistance > bussDistance);
			System.out.println("Moto WIN!!!");
		}

		Transport[] transports = new Transport[3];

		transports[0] = car[0];
		transports[1] = moto[2];
		transports[2] = buss[1];

		int distance = 0;
		for (Transport transport : transports) {
			distance += transport.getSpeed();
		}
		System.out.println("Distance = " + distance);
	}

	private static Transport[] getCommand(String className, int demantion) {
		Transport[] transports = new Transport[demantion];
		for (int i=0; i< transports.length; i++) {
			if (className.equals("Car")) {
				transports[i] = new Car();
			} else if (className.equals("Buss")) {
				transports[i] = new Buss();
			} else {
				transports[i] = new Moto();
			}
		}
		return transports;
	}

	private static int calcDistance(Transport[] transports) {
		int distance = 0;
		for (Transport transport : transports) {
			distance += transport.getSpeed();
		}
		System.out.println("Transport result = " + distance);

		return distance;
	}

}
