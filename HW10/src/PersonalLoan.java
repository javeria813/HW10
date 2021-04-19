

public class PersonalLoan extends Loan {
	PersonalLoan(
			String loanNumber,
			String lastName, 
			double loanAmount, 
			int loanTerm, 
			double Primeinterestrate) { 
		super(loanNumber, lastName, loanAmount, loanTerm); 
		super.primeinterestRate = 0.02 / (Primeinterestrate / 100); }
	}
