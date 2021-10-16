package controlstatments;

public class IfDemo {

	public static void main(String[] args) {

		int x = 10;
		int y = 20;

		if (x < y) {
			System.out.println("Y is bigget than X :" + y);
		}

		x = x * 2;

		if (x == y) {
			System.out.println("Both X and Y are equal");

		}

		x = x * 2;

		if (x > y) {
			System.out.println("X is bigget than Y :" + x);

		}
		
		if (x == y) {
			System.out.println("Both X and Y are equal");

		}
		
		System.out.println("EXIT");

	}

}
