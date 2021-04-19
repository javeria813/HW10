

public class BusinessLoan extends Loan {
	BusinessLoan(
			String loanNumber, 
			String lastName, 
			double loanAmount, 
			int loanTerm, 
			double Primeinterestrate) {
		super(loanNumber, lastName, loanAmount, loanTerm);
		super.primeinterestRate = 0.01 / (Primeinterestrate / 100); } 
	}
