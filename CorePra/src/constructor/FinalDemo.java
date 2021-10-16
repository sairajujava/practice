package constructor;

public final class FinalDemo {

	public final int a = 10;
	public final int b = 20;

	public final int add() {
		return (a + b);
	}
	
	private int sub() {
		return (a - b);
	}

	public static void main(String[] args) {

		FinalDemo fd = new FinalDemo();
		// fd.a = 200; // compile time error
		// fd.b = 400;

		System.out.println("A value :" + fd.a);
		System.out.println("B value :" + fd.b);

	}

}
