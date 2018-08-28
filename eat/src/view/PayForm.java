package view;




import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class PayForm extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PayForm frame = new PayForm();
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
	public PayForm() {
		setMaximizable(true);
		setClosable(true);
		setTitle("\u7ED3\u8D26");
		setBounds(100, 100, 589, 411);
		getContentPane().setLayout(null);
	}

}
