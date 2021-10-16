package basics;

public class InstancevarDemo {

	public int a;
	public int b;
	public int sum;

	public static void main(String[] args) {
		
		InstancevarDemo obj = new InstancevarDemo();
		
		System.out.println("A value :"+obj.a);
		System.out.println("B value :"+obj.b);
		
		obj.a = 100;
		obj.b = 200;
		obj.sum= obj.a + obj.b;
		
		System.out.println("Sum :"+obj.sum);

	}

}
