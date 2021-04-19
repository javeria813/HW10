

import java.awt.EventQueue; import javax.swing.JFrame;

public class File2 {
	private JFrame frame;

	/**
	* Launch the application.
	*/
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					File2 window = new File2();
					window.frame.setVisible(true); }
				catch (Exception exc) {
					exc.printStackTrace(); }
				}
			});
		}

	/**
	 * Create the application.
	 */
	public File2() {
		initialize(); }

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(99, 99, 470, 310);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); }
}