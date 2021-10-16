package abstractdemo;

public class SBI implements RBI {

	@Override
	public double calPerLoanInterest(double prinicipleAmt, float ri, double time) {

		float monRi = ri / (12 * 100);

		double monTime = time * 12;

		double emi = (prinicipleAmt * monRi * Math.pow(1 + monRi, monTime)) / (Math.pow(1 + monRi, monTime) - 1);

		// System.out.print(" EMI is= "+emi+"\n");

		return emi;

	}

	@Override
	public double calHomeLoanInterest(double prinicipleAmt, float ri, double time) {

		float monRi = ri / (12 * 100);

		double monTime = time * 12;

		double emi = (prinicipleAmt * monRi * Math.pow(1 + monRi, monTime)) / (Math.pow(1 + monRi, monTime) - 1);

		// System.out.print(" EMI is= "+emi+"\n");

		return emi;
	}

}
