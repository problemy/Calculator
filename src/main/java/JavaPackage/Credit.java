package JavaPackage;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Credit {
	private int years;
	private double amount;
	private double commision;
	private double percentage;
	private double totalCreditSum;
	private InstalmentsType instalmentsType;
	private ArrayList<Installment> instalments = new ArrayList<Installment>();
	private DecimalFormat df = new DecimalFormat("#.00"); 
	
	public Credit(int years, double amount, double commision, double percentage, InstalmentsType type){
		this.years = years;
		this.amount = amount;
		this.commision = commision;
		this.percentage = percentage;
		this.instalmentsType = type;
		this.totalCreditSum = this.amount+(this.amount*this.percentage);
		generateCreditDependOnType(type);
	}
	
	public ArrayList<Installment> equalInstallments(){
		ArrayList<Installment> installments = new ArrayList<Installment>();
		int sumOfRates = this.years*12;


		double q = 1 + (this.percentage/12);  
		double monthlyInstallment;
		double principal = totalCreditSum/sumOfRates;
		double interest;

		for(int i = sumOfRates; i > 0; i--) {
			monthlyInstallment = this.totalCreditSum * Math.pow(q,sumOfRates) * ((q-1)/(Math.pow(q, sumOfRates) -1));

			interest = monthlyInstallment - principal;

			installments.add(new Installment(interest,principal));

		}
		
		return installments;		
	}
	
	public ArrayList<Installment> decreasingInstallments(){
		ArrayList<Installment> installments = new ArrayList<Installment>();
		int sumOfRates = this.years*12;
		double principal = this.amount/sumOfRates;
		double monthlyInstallment;
		double interest;
		for(int i=1; i <= sumOfRates; i++) {
			monthlyInstallment = (this.amount / sumOfRates) * (1+(sumOfRates-i+1)*(this.percentage/12));
			interest = monthlyInstallment-principal;

			installments.add(new Installment(interest, principal));

			
		}
		return installments;
		}

	public void generateCreditDependOnType(InstalmentsType type) {
		
		switch(type) {
		case EQUAL :
			this.instalments = this.equalInstallments() ;
			break;
		case DECREASING:
			this.instalments = this.decreasingInstallments();
		default:
			break;
		}
		
	}
	public int getYears() {
		return years;
	}


	public double getAmount() {
		return amount;
	}


	public double getCommision() {
		return commision;
	}


	public double getPercentage() {
		return percentage;
	}



	public double getTotalCreditSum() {
		return totalCreditSum;
	}



	public InstalmentsType getInstalmentsType() {
		return instalmentsType;
	}


	public ArrayList<Installment> getInstallments(){
		return this.instalments;
	}


	
	
	
}
