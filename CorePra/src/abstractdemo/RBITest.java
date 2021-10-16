package abstractdemo;

public class RBITest {

	public static void main(String[] args) {

		RBI r;

		r = new ICICI();

		double emi = r.calPerLoanInterest(100000.00d, 10.25f, 1);
		System.out.print(" ICICI Personal Loan Monthly EMI is= " + emi + "\n");
		
		double hemi = r.calHomeLoanInterest(1000000.00d, 6.75f, 1);
		System.out.print(" Home Loan Monthly EMI is= " + hemi + "\n");
		
		System.out.println("============================================");
		
		r = new SBI();

		double semi = r.calPerLoanInterest(100000.00d, 12.25f, 1);
		System.out.print(" SBI Personal Loan Monthly EMI is= " + semi + "\n");
		
		double shemi = r.calHomeLoanInterest(1000000.00d, 6.75f, 1);
		System.out.print(" Home Loan Monthly EMI is= " + shemi + "\n");


	}

}
