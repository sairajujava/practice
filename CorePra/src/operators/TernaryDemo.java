package operators;

public class TernaryDemo {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		int res = (a > b) ? a : b;
		
		System.out.println(res);
		
		String s = null;
		
		String res1 = (s != null) ? s : null;
		
		System.out.println(res1);
	}

}
