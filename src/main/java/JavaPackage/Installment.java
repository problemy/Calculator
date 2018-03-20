package JavaPackage;

public class Installment {

	private double interest;
	private double principal;	
	private double total;
	
	public Installment(double interests, double principal) {
		this.interest = interests;
		this.principal = principal;
		this.total = interests+principal;
	}
	
	public double getInterest() {
		return interest;
	}

	public double getPrincipal() {
		return principal;
	}

	public double getTotal() {
		return total;
	}

	
}
