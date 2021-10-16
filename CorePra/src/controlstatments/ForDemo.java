package controlstatments;

public class ForDemo {

	public static void main(String[] args) {

		int i = 1;
		int t = 50;

		for (i = 1; i <= t; i++) {
			System.out.print(" " + i);
		}
		
		System.out.println();
		// Type - 2
		
		for (int j = 1; j <= 50; j++) {
			System.out.print(" " + j);
		}
		
		System.out.println();
		
		// Type - 3
		
		for(int k=1; k<=50;) {
			System.out.print(" "+k);
			k++;
		}
		
		System.out.println();
		
		// Type - 4
		
		for(int l = 1; ;) {
			
			if(l <= 50) {
				System.out.print(" "+l);
				l++;
			}
			System.out.println();
		}
		
		

	}

}
