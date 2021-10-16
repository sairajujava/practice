package abstractdemo;

public interface RBI {

	public float DEFUALT_RBI_INTEREST = 7.2f;

	public double calPerLoanInterest(double prinicipleAmt , float ri , double time);
	
	public double calHomeLoanInterest(double prinicipleAmt , float ri , double time);

	// jdk 8 features
	
	default public void show() {

	}

	int a = 100;
	int b = 200;

	public static int add() {
		return (a + b);
	}

}
