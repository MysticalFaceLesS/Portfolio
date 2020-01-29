package Dz21;

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	
	public class Dz21 {

		public static void main(String[] args) {

//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//			try {
//				System.out.println("Input A:");
//				String a = br.readLine();
	//
//				System.out.println("Input B:");
//				String b = br.readLine();
	//
//				System.out.println("Input C:");
//				String c = br.readLine();
	//
//				double D = calcDesc(Double.parseDouble(a), Double.parseDouble(b), Double.parseDouble(c));
	//
//				double x1 = calcX1(D, Double.parseDouble(a), Double.parseDouble(b));
//				double x2 = calcX2(D, Double.parseDouble(a), Double.parseDouble(b));
	//
//				System.out.println("x1=" + x1 + ", x2=" + x2);

//			} catch (IOException e) {
//				e.printStackTrace();
//			} catch (Exception e) {
//				System.out.println(e.getMessage());
//			}

			runUnitTests();
			runFuncTest();
		}

		public static double[] calc(double a, double b, double c) {
			try {
				double x1 = calcA(a, c);
				double x2 = calcB(b, c);
				double[] res = {x1 + x2};
				return res;
			} catch (Exception e) {
				double[] res = new double[2];
				return res;
			}
		}

		public static double calcDesc(double a, double b, double c) {
			return (a - c) - (b + c);
		}

		public static double calcA(double a, double c) throws Exception {
			return (a - c);
		}

		public static double calcB(double b, double c) throws Exception {
			return (b + c);
		}

		public static void runUnitTests() {

			try {
				double c = calcDesc(4.0, 2.0, 1.0);
				if (c == 0.0) {
					System.out.println("Unit calcDesc work fine");
				} else {
					System.err.println("Unit calcDesc not work fine");
				}

				double x1 = calcA(4.0, 1.0);
				if (x1 == 3.0) {
					System.out.println("Unit calcA work fine");
				} else {
					System.err.println("Unit calcB not work fine");
				}

				double x2 = calcB(2.0, 1.0);
				if (x2 == 3.0) {
					System.out.println("Unit calcB work fine" );
				} else {
					System.err.println("Unit calcB not work fine");
				}

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		public static void runFuncTest() {

			double[] res = calc(2, -5, 6);
			if (res[0] == 3 && res[1] == 2) {
				System.out.println("Unit calc work fine" );
			} else {
				System.err.println("Unit calc not work fine");
			}

		}
	}