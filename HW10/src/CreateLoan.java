/*
 * Javeria Ayaz
 * This program will track all new construction loans. The application will also calculate
 * the total amount owed at the due date. The application should include 
 * the following classes Loan.java, LoanConstants.java, BusinessLoan.java, PersonalLoan.java,
 * and CreateLoans.java.
 */

import java.util.*;

class CreateLoan {
	private Loan[] loan_details = new Loan[5];

	public static void main(String[] args) {
		CreateLoan loan = new CreateLoan();
		loan.getLoanDetails();
		loan.displayDetails(); }

	public void displayDetails() {
		System.out.println(
				"Loan Number\tLast Name\tLoan Amount\t" + 
		"Interest Rate\tLoan Term\tTotal Amount owed");

		for (int i = 0; i < loan_details.length; i++) {
			System.out.println(loan_details[i].toString()); }
		}

	public static Character getTypeofloan() {
		Scanner s1 = new Scanner(System.in);
		Character Typeofloan;

		do {
			//System.out.println("Is the loan for business or for individual applicant? ");
			System.out.print("Press 'I' for Individual and 'B' for Businness Loans: ");
			Typeofloan = s1.next().toUpperCase().charAt(0);
			
			if (!((Typeofloan.equals('I')) || (Typeofloan.equals('B'))))
				System.out.println(" Please make sure to press 'I' for Individual or 'B' for Businness Loans! "); } 
		while (!((Typeofloan.equals('I')) || (Typeofloan.equals('B'))));
		return Typeofloan; }

	public static String getLoanNumber() {
		Scanner s1 = new Scanner(System.in);

		System.out.print("Please Enter the Loan Number: ");
		return s1.next(); }

	
	public static String getLastname() {
		Scanner s1 = new Scanner(System.in);
		String lastname;

		try { 
			System.out.print("Please Enter the Last Name of the Customer: ");
			lastname = s1.next();
			for (int i = 0; i < lastname.length(); i++) {
				if (Character.isDigit(lastname.charAt(i)) || !(Character.isLetterOrDigit(lastname.charAt(i)))) {
					throw (new InputMismatchException(" PLease make sure you are entering the Last Name of the Customer!")); }
				}
		}
		
		catch (InputMismatchException exc) {
			getExceptionMessage("Last Name", exc);
			return getLastname(); }
		return lastname; }

	public static double getLoanAmount() {
		Scanner s1 = new Scanner(System.in);
		double loanAmount;
		try {
			System.out.print("Please enter the Amount of Loan you would like to take out: ");
			loanAmount = s1.nextDouble();
			if (loanAmount <= 0) { 
				throw (new InputMismatchException(" Loan Amount can not be less than zero or zero!")); }
			else if (loanAmount > 500000) {
				throw (new InputMismatchException(" Loan Amount can no more be over $500,000.00!")); }

			return loanAmount; }
		catch (InputMismatchException exc) {
			getExceptionMessage("Loan Amount", exc);
			return getLoanAmount(); }
	}

	public static double getPrimeinterestrate() {
		Scanner s1 = new Scanner(System.in);
		double prime_interest_rate;

		try {
			System.out.print("Prime Interest Rate (%): ");
			prime_interest_rate = s1.nextDouble();

			if (prime_interest_rate <= 0) {
				throw (new InputMismatchException(" The Interest rate can not be less than zero or zero!")); }

			return prime_interest_rate; } 
		catch (InputMismatchException exc) {
			getExceptionMessage("interest rate", exc);
			return getPrimeinterestrate(); }
		}

	public static int getLoanTerm() {
		Scanner s1 = new Scanner(System.in);

		try {
			System.out.println("how long do you want your loan term to be?  ");
			System.out.print("Pess '1' for Short Term (1 year), '2' for Medium Term (3 years), "
					+ "'3' for Long Term Loans (5 years): ");
			return s1.nextInt(); } 
		
		catch (InputMismatchException exc) {
			getExceptionMessage("Loan Term", exc);
			return getLoanTerm(); } 
		}

	public void getLoanDetails() {
		Character typeofloan;
		String loanNumber;
		String lastname;
		double loanAmount;
		double primeinterestRate;
		int loanTerm;

		for (int i = 0; i < loan_details.length; i++) {
			System.out.println("Please enter the details for the loan of the customer " + (i + 1));
			
			loanAmount = getLoanAmount();
			primeinterestRate = getPrimeinterestrate();
			loanTerm = getLoanTerm();
			typeofloan = getTypeofloan();
			loanNumber = getLoanNumber();
			lastname = getLastname();

			System.out.println();

			if (typeofloan.equals('I')) {
				loan_details[i] = new PersonalLoan(loanNumber, lastname, 
						loanAmount, loanTerm, primeinterestRate); }
			else if (typeofloan.equals('B')) {
				loan_details[i] = new BusinessLoan(loanNumber, lastname, 
						loanAmount, loanTerm, primeinterestRate); } 
			}
		}

	public static void getExceptionMessage(String clientData, InputMismatchException exc) {
		if (exc.getMessage() == null) {
			System.out.println(" * What you have entered is Invalid. Enter the" + clientData + "*"); } 
		else {
			System.out.println("INVALID" + exc.getMessage()); }
		}
	}


