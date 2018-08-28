package view;




import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class CheckEatForm extends JInternalFrame {

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
	public CheckEatForm() {
		setMaximizable(true);
		setClosable(true);
		setTitle("\u67E5\u770B\u83DC\u54C1");
		setBounds(100, 100, 589, 411);
		getContentPane().setLayout(null);
	}

}
