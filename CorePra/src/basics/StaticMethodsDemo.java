package basics;

public class StaticMethodsDemo {
	
	
	static int a = 100;
	static int b = 200;
	static int c;

	public static void add() {

		int c = a + b;
		System.out.println("Addition :" + c);

	}

	public static void sub() {
       // static methods can access only static variables it will not access instance variables
		c = a - b;
		System.out.println("Substraction :"+c);
	}

	public static void main(String[] args) {
		
		StaticMethodsDemo.add();
		StaticMethodsDemo.sub();

	}

}
