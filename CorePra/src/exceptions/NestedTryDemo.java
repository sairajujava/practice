package exceptions;

public class NestedTryDemo {

	private static void demo() {

		try {

			// handle AE

			try {
				int a = 10;
				int b = 0;
				int c = a / b;
				System.out.println(c);

			} catch (ArithmeticException e) {
				System.out.println("AE:" + e.getMessage());
			}

			// NPE

			try {

				String s = null;
				int len = s.length();
				System.out.println(len);
			} catch (NullPointerException e) {
				System.out.println("AE:" + e.getMessage());
			}

		} catch (Exception e) {
			System.out.println("Parent exception:" + e.getMessage());
		} finally {
			System.out.println("outer finally block...");
		}
		System.out.println("EXIT");

	}

	public static void main(String[] args) {

		demo();

	}

}
