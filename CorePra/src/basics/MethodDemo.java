package basics;

public class MethodDemo {

	int a = 100;
	int b = 200;
	static int c;

	public void add() {

		int c = a + b;
		System.out.println("Addition :" + c);

	}

	public void sub() {
       // instance method can be accessing both static and instance variables
		c = a - b;
		System.out.println("Substraction :"+c);
	}

	public static void main(String[] args) {

		MethodDemo m = new MethodDemo();
		m.add();// method calling
		m.sub();

	}

}
