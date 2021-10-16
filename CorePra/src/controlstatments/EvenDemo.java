package controlstatments;

public class EvenDemo {

	public static void main(String[] args) {
		
		for(int i =2 ; i <=50;) {
			System.out.print(" "+i);
			i += 2;  //i = i+2;
		}
		System.out.println(" ");
		
		
		for(int j=2;j<=50;) {
			if(j%2 == 0) {
				System.out.print(" "+j);
			}
			j++;
		}
		
		System.out.println(" ");
		
		for(int j=0;j<=50;) {
			if(j%2 == 1) {
				System.out.print(" "+j);
			}
			j++;
		}
		
		System.out.println(" ");

	}
	

}
