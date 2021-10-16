package basics;

public class StaticvarDemo {

	public static int a;
	public static int b;
	public static int sum;

	public static void main(String[] args) {
		
		System.out.println("A value :"+StaticvarDemo.a);
		System.out.println("A value :"+StaticvarDemo.b);
		System.out.println("A value :"+StaticvarDemo.sum);
		
		StaticvarDemo.a = 100;
		StaticvarDemo.b = 200;
		StaticvarDemo.sum = StaticvarDemo.a + StaticvarDemo.b;
		
		System.out.println("Sum :"+StaticvarDemo.sum);

	}

}
