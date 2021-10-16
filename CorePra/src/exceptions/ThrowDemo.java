package exceptions;

import java.io.IOException;

public class ThrowDemo {

	private static void validate(int age) throws IOException {
		
		if( age < 18) {
			
			throw new IOException("Candidate is minor he/she is not eligible for voting");
		}else {
			System.out.println("Candidate is Major:"+age);
		}
		
	}
	public static void main(String[] args) throws IOException {
		
		validate(17);

	}


}
