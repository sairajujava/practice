package oops;

public class MethodOverloadingDemo {
	
	// Rule - 1
	
	public int add(int a , int b) {
		return (a+b);
	}
	
	public void add(int a, int b, int c) {
		System.out.println("Addition :"+(a+b+c));
	}
	
	// Rule - 2
	
	public float add(int a , float b) {
		return (a+b);
	}
	
	// Rule - 3
	
	public float add(float a , int b) {
		return (a+b);
	}

	public static void main(String[] args) {
		
		MethodOverloadingDemo d = new MethodOverloadingDemo();
		int res = d.add(10, 20);
		System.out.println("Addition of Two Nums:"+res);
		d.add(5, 7, 9);
		
		float res1 = d.add(100, 405.50f);
		System.out.println("Flaot res:"+res1);
		
		float res2 = d.add(100.12f, 405);
		System.out.println("Flaot res2:"+res2);

	}

}
