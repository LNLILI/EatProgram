package view;



import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class ChoseEatForm extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChoseEatForm frame = new ChoseEatForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ChoseEatForm() {
		setMaximizable(true);
		setClosable(true);
		setTitle("\u70B9\u9910");
		setBounds(100, 100, 589, 411);
		getContentPane().setLayout(null);
	}

}

