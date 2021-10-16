package exceptions;

public class ExceptionsDemo {

	private static void nullDemo() {

		try {

			String s = null;
			int len = s.length();
			System.out.println("Length:" + len);
		} catch (Exception e) {
			System.out.println("NullPointerException :" + e.getMessage());
		} catch (NullPointerException e) { // compile time error becuase Excpetion parent class has already handle the Nullpointer Exception
			System.out.println("Exception Parent handlend :" + e.getMessage());
		}

		finally {
			System.out.println("I am finally block i will execute every time");
		}
		System.out.println("EXIT");

	}

	private static void aritheDemo() {
		int c = 0;
		try {

			int a = 10;
			int b = 0;
			c = a / b;
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception:" + e.getMessage());
		} finally {
			System.out.println("I am finally block i will execute every time");
		}

		System.out.println(c);

	}

	private static void arrayIndexDemo() {

		int[] intArr = new int[3];
		try {

			intArr[0] = 10;
			intArr[1] = 11;
			intArr[2] = 12;
			intArr[3] = 14;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndex:" + e.getMessage());

		} finally {
			System.out.println("I am finally block i will execute every time");
		}
		for (int nums : intArr) {
			System.out.println("Array :" + nums);
		}

	}

	public static void main(String[] args) {

		nullDemo();
		aritheDemo();
		arrayIndexDemo();

	}

}
