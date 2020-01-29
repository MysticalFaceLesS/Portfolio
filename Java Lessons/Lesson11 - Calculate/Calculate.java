import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculate {

	public static void main(String[] args) {

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//		try {
//			System.out.println("Input A:");
//			String a = br.readLine();
//
//			System.out.println("Input B:");
//			String b = br.readLine();
//
//			System.out.println("Input C:");
//			String c = br.readLine();
//
//			double D = calcDesc(Double.parseDouble(a), Double.parseDouble(b), Double.parseDouble(c));
//
//			double x1 = calcX1(D, Double.parseDouble(a), Double.parseDouble(b));
//			double x2 = calcX2(D, Double.parseDouble(a), Double.parseDouble(b));
//
//			System.out.println("x1=" + x1 + ", x2=" + x2);

//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}

		runUnitTests();
		runFuncTest();
	}

	public static double[] calc(double a, double b, double c) {
		try {
			double D = calcDesc(a, b, c);
			double x1 = calcX1(D, a, b);
			double x2 = calcX2(D, a, b);
			double[] res = {x1, x2};
			return res;
		} catch (Exception e) {
			double[] res = new double[2];
			return res;
		}
	}

	public static double calcDesc(double a, double b, double c) {
		return b*b - 4*a*c;
	}

	public static double calcX1(double d, double a, double b) throws Exception {
		if (d < 0) {
			throw new Exception("D < 0");
		}
		return (-b + Math.sqrt(d)) / (2*a);
	}

	public static double calcX2(double d, double a, double b) throws Exception {
		if (d < 0) {
			throw new Exception("D < 0");
		}
		return (-b - Math.sqrt(d)) / (2*a);
	}

	public static void runUnitTests() {

		try {
			double d = calcDesc(3.0, 4.0, 1.0);
			if (d == 4.0) {
				System.out.println("Unit calcDesc work fine");
			} else {
				System.err.println("Unit calcDesc not work fine");
			}

			double x1 = calcX1(16.0, 1.0, 2.0);
			if (x1 == 1.0) {
				System.out.println("Unit calcX1 work fine");
			} else {
				System.err.println("Unit calcX1 not work fine");
			}

			double x2 = calcX2(16.0, 1.0, 2.0);
			if (x2 == -3.0) {
				System.out.println("Unit calcX2 work fine" );
			} else {
				System.err.println("Unit calcX2 not work fine");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void runFuncTest() {

		double[] res = calc(1, -5, 6);
		if (res[0] == 3 && res[1] == 2) {
			System.out.println("Unit calc work fine" );
		} else {
			System.err.println("Unit calc not work fine");
		}

	}
}
