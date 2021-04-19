

import java.util.InputMismatchException;

public abstract class Loan implements LoanConstants {
	private String lastName; private String loanNumber; private double loanAmount;
	protected double primeinterestRate; private int loanTerm;
	
	Loan(String loanNumber, String lastName, double loanAmount, int loanTerm) {
		this.loanNumber = loanNumber;
		this.lastName = lastName.toUpperCase();

		try {
			if (loanAmount > MAXIMUM_LOAN_AMOUNT) {
				throw (new InputMismatchException("The Loan amount you've entered is over $500,000.00")); } 
			else {
				this.loanAmount = loanAmount; } 
			}
		catch (InputMismatchException e) { 
			System.out.println(e.getMessage()); }

		switch (loanTerm) {
		case MEDIUM_TERM:
		case LONG_TERM:
			this.loanTerm = loanTerm;
			break;

		case SHORT_TERM:
		default:
			this.loanTerm = 1;
			break; } 
		}
	
	public String toString() {
		return String.format("%s\t\t%s\t\t$%,.2f\t%.2f%%\t\t%d\t\t$%,.2f", 
				this.loanNumber, this.lastName, this.loanAmount, 
				this.primeinterestRate * 100, this.loanTerm,
				this.loanAmount + (this.loanAmount * this.primeinterestRate)); }
	}



