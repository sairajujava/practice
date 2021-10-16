package operators;

public class LogicalDemo {

	public static void main(String[] args) {

		int a = 10;
		int b = 5;
		int c = 20;

		System.out.println((a < b) && (a > c)); // F
		System.out.println((c > a) && (b < c)); // T
		System.out.println((a > b) && (c > a)); // T
		System.out.println((a <= b) && (c >= a));// F
		
		System.out.println("===============================");
		
		System.out.println((a < b) || (a > c)); //F
		System.out.println((c > a) || (b < c)); //T
		System.out.println((a > b) || (c > a)); //T
		System.out.println((a <= b) || (c >= a));//T

	}

}
