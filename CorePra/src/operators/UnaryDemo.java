package operators;

public class UnaryDemo {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
	
		System.out.println("===============Before Increment=============");
		System.out.println("A value:"+a);
		System.out.println("B value:"+b);
		
		// preincrement
		
		++ a;
		++ b;
		System.out.println("===============After PreIncrement=============");
		System.out.println("A value:"+a);
		System.out.println("B value:"+b);
		
		System.out.println("===========Post Increment===============");
		
		a ++;
		System.out.println("A value :"+a);
		b ++;
		System.out.println("B value :"+b);
		
		
		int c = ++ a + b ++; // ++ 13 + 22 ++;
		
		System.out.println("Addition :"+c);
		
		System.out.println("Post Increment B Value :"+b); // b = 23 , a = 13
		
		
		
		System.out.println("====================================================");
		
		System.out.println("===============Before decrement=============");
		System.out.println("A value:"+a); // 13
		System.out.println("B value:"+b); // 23
		
		// preincrement
		
		-- a; // 11
		-- b; // 22
		System.out.println("===============After Predecrement=============");
		System.out.println("A value:"+a); // 12
		System.out.println("B value:"+b); // 22
		
				
		int d = --a + b --;  // d = 33
		
		System.out.println("Addition :"+d); // 33
		
		System.out.println("Post decrement B Value :"+b); // 21
		

	}

}
