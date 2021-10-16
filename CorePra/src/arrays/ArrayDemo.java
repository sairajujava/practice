package arrays;

public class ArrayDemo {
	public static void arrayDeclaration() {

		// Type - 1

		int[] intArr = new int[5];
		intArr[0] = 1;
		intArr[1] = 3;
		intArr[2] = 1;
		intArr[3] = 3;
		intArr[4] = 30;

		int len = intArr.length;
		System.out.println("Arr Length:" + len);

		for (int i = 0; i < intArr.length; i++) {

			System.out.println(i + " ===> " + intArr[i]);

		}

		System.out.println("================================");
		// iterate elements using for-each loop

		for (int i : intArr) {
			System.out.println(i);
		}

		// Type - 2

		String[] strArr = { "apple", "banana", "orange", "guava", "kiwi", "mango" };

		System.out.println("StringArr Length:" + strArr.length);

		for (String s : strArr) {
			System.out.println(s);

		}

	}

	public static void main(String[] args) {

		arrayDeclaration();

	}

}
