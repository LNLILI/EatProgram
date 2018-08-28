package view;




import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JFormattedTextField;

public class CheckEatForm extends JInternalFrame {
	private JTextField textField;

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
		
		JLabel lblNewLabel = new JLabel("\u540D\u79F0:");
		lblNewLabel.setBounds(61, 28, 54, 15);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(103, 25, 104, 21);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u67E5\u627E");
		btnNewButton.setBounds(418, 24, 93, 23);
		getContentPane().add(btnNewButton);
	}
}
