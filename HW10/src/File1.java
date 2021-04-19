// 
// This is using GUI
//
import java.awt.EventQueue;
import javax.swing.JFrame; import javax.swing.JButton; import java.awt.event.ActionListener;
import java.awt.event.ActionEvent; import javax.swing.JTextField; import javax.swing.JLabel;
import javax.swing.JScrollPane; import java.util.*; import java.awt.Color;

public class File1 {
	List<Loan> mylist = new ArrayList<Loan>();
	public JFrame frame;
	private JTextField textField;
	JLabel NewLabel;
	JLabel NewLabel1;
	int counter = 1;
	private JLabel lblNewLabel_2; private JLabel lblNewLabel_3; private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5; private JLabel lblNewLabel_6; private JLabel lblNewLabel_7;
	private JTextField textField_1; private JTextField textField_2; private JTextField textField_3;
	private JTextField textField_4; private JTextField textField_5;

/**
 * Launch the application.
 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				File1 window = new File1();
				window.frame.setVisible(true); } 
				catch (Exception exc) {
					exc.printStackTrace(); }
				}
			});
		}

/**
 * Create the application.
 */
	public File1() {
	initialize();
	NewLabel.setText("Loan Details For Customer " + counter);

	lblNewLabel_2 = new JLabel("Prime Interest Rate:");
	lblNewLabel_2.setBounds(35, 165, 152, 15);
	frame.getContentPane().add(lblNewLabel_2);

	lblNewLabel_3 = new JLabel("Select Loan Term ");
	lblNewLabel_3.setBounds(35, 195, 167, 23);
	frame.getContentPane().add(lblNewLabel_3);

	lblNewLabel_4 = new JLabel("1 For Short Term(1 year). 2 For Medium Term(3 years)  3 For Long Term(5 years)");
	lblNewLabel_4.setBounds(35, 229, 362, 15);
	frame.getContentPane().add(lblNewLabel_4);

	lblNewLabel_5 = new JLabel("Press 'P' For Personal And 'B' For Businness Loans");
	lblNewLabel_5.setBounds(35, 255, 293, 15);
	frame.getContentPane().add(lblNewLabel_5);

	lblNewLabel_6 = new JLabel("Please Enter Loan Number Of Client");
	lblNewLabel_6.setBounds(35, 295, 208, 15);
	frame.getContentPane().add(lblNewLabel_6);

	lblNewLabel_7 = new JLabel("Please Enter Cilent Last Name");
	lblNewLabel_7.setBounds(35, 316, 271, 15);
	frame.getContentPane().add(lblNewLabel_7);

	textField_1 = new JTextField();
	textField_1.setBounds(365, 173, 88, 20);
	frame.getContentPane().add(textField_1);
	textField_1.setColumns(10);

	textField_2 = new JTextField();
	textField_2.setBounds(365, 225, 88, 20);
	frame.getContentPane().add(textField_2);
	textField_2.setColumns(10);

	textField_3 = new JTextField();
	textField_3.setBounds(365, 255, 85, 20);
	frame.getContentPane().add(textField_3);
	textField_3.setColumns(10);

	textField_4 = new JTextField();
	textField_4.setBounds(365, 295, 85, 20);
	frame.getContentPane().add(textField_4);
	textField_4.setColumns(10);

	textField_5 = new JTextField();
	textField_5.setBounds(365, 315, 85, 20);
	frame.getContentPane().add(textField_5);
	textField_5.setColumns(10);

	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setBounds(860, 125, 2, 2);

	frame.getContentPane().add(scrollPane);
}

	
/**
 * Initialize the contents of the frame.
 */
	public void reset() {
	NewLabel.setText("Loan Details For Customer " + counter);
	textField.setText("");
	textField_1.setText("");
	textField_2.setText("");
	textField_3.setText("");
	textField_4.setText("");
	textField_5.setText(""); }
	
	private void initialize() {
	frame = new JFrame();
	frame.setForeground(Color.BLUE);
	frame.setBounds(150, 150, 1180, 480);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);
	frame.resize(600, 600);
	JButton btnNewButton = new JButton("Submit");
	btnNewButton.addActionListener(new ActionListener() {
		@SuppressWarnings("deprecation")
		public void actionPerformed(ActionEvent arg0) {

			counter++;
			Loan dr = new loan (textField_4.getText(), textField_5.getText(),
					Double.parseDouble(textField.getText()), Integer.parseInt(textField_2.getText()),
					Double.parseDouble(textField_1.getText()), textField_3.getText());
			mylist.add(dr);

			reset();
			if (counter == 6) {
				Output demo = new Output(mylist);
				frame.setVisible(false);
				demo.resize(800, 500);
				demo.show(); }
			}
		});
	
	btnNewButton.setBounds(184, 358, 120, 25);
	frame.getContentPane().add(btnNewButton);

	textField = new JTextField();
	textField.setBounds(362, 133, 89, 24);
	frame.getContentPane().add(textField);
	textField.setColumns(10);

	NewLabel = new JLabel("Enter Name");
	NewLabel.setBounds(130, 84, 300, 35);
	frame.getContentPane().add(NewLabel);

	NewLabel1 = new JLabel("Enter Loan Amount:");
	NewLabel1.setBounds(35, 135, 162, 15);
	frame.getContentPane().add(NewLabel1); }
	
}


