

import java.awt.EventQueue; import java.util.List; import javax.swing.JFrame;
import javax.swing.JEditorPane; import javax.swing.JLabel;

public class Output extends JFrame {
	List<Loan> mylist;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Output window = new Output(null);
					window.frame.setVisible(true); }
				catch (Exception exc) {
					exc.printStackTrace(); }
				}
			});
		}

	
	/**
	 * Create the application.
	 */
	
	public Output(List<Loan> mylist2) {
		mylist = mylist2;

		getContentPane().setLayout(null);

		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(15, 105, 52, 202);
		getContentPane().add(editorPane);

		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(100, 78, 78, 16);
		getContentPane().add(lblNewLabel);

		JEditorPane editorpane_1 = new JEditorPane();
		editorpane_1.setBounds(84, 105, 117, 203);
		getContentPane().add(editorpane_1);

		JEditorPane editorPane_2 = new JEditorPane();
		editorPane_2.setBounds(210, 105, 78, 203);
		getContentPane().add(editorPane_2);

		JEditorPane editorPane_3 = new JEditorPane();
		editorPane_3.setBounds(299, 105, 78, 203);
		getContentPane().add(editorPane_3);

		JEditorPane editorPane_4 = new JEditorPane();
		editorPane_4.setBounds(405, 105, 50, 203);
		getContentPane().add(editorPane_4);

		JLabel lblLoanAmount = new JLabel("Loan Amount");
		lblLoanAmount.setBounds(200, 77, 77, 15);
		getContentPane().add(lblLoanAmount);

		JLabel lblInterestRate = new JLabel("Interest Rate");
		lblInterestRate.setBounds(298, 77, 77, 15);
		getContentPane().add(lblInterestRate);

		JLabel lblLoanTerm = new JLabel("Loan Term");
		lblLoanTerm.setBounds(397, 78, 64, 15);
		getContentPane().add(lblLoanTerm);

		JLabel lblLoanNumber = new JLabel("Loan Number");
		lblLoanNumber.setBounds(10, 77, 77, 15);
		getContentPane().add(lblLoanNumber);

		JLabel lblMoneyOwed = new JLabel("Money Owed By Customer");
		lblMoneyOwed.setBounds(474, 78, 134, 15);
		getContentPane().add(lblMoneyOwed);

		JEditorPane editorPane_4_1 = new JEditorPane();
		editorPane_4_1.setBounds(484, 100, 51, 202);
		getContentPane().add(editorPane_4_1);

		for (int x1 = 0; x1 < mylist2.size(); x1++) {
			Loan d1 = mylist.get(x1);

			editorPane.setText(editorPane.getText() + '\n' + (d1.LoanNumber));

			editorpane_1.setText(editorpane_1.getText() + '\n' + (d1.lastname));

			editorPane_2.setText(editorPane_2.getText() + '\n' + "$" + String.valueOf(d1.loanAmount));
			editorPane_3.setText(editorPane_3.getText() + '\n' + String.valueOf(d1.interestRate * 100) + "%");
			editorPane_4.setText(editorPane_4.getText() + '\n' + String.valueOf(d1.loanTerm));
			editorPane_4_1.setText(editorPane_4_1.getText() + '\n' + String.valueOf(d1.moneyowed));
		}
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}