package exceptions;

import java.io.IOException;

public class ThrowsDemo {

	private void p() throws IOException{
		
		throw new IOException("Device blocked error");
		
	}
	private void n() throws IOException {
		this.p();
	}
	private void m() {
		try {
			// methiod implicitly calling
			this.n();
		}catch (Exception e) {
			System.out.println("Handle Parent for Exception Propegztion here :"+e.getMessage());
		}
		
	}
	public static void main(String[] args) {
		
		ThrowsDemo td = new ThrowsDemo();
		td.m();
		System.out.println("Normal flow");

	}


}
