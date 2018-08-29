package view;




import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JFormattedTextField;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

public class CheckEatForm extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

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
		setBounds(100, 100, 827, 479);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u540D\u79F0:");
		lblNewLabel.setBounds(79, 28, 54, 15);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(143, 25, 104, 21);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u67E5\u627E");
		btnNewButton.setBounds(641, 24, 68, 23);
		getContentPane().add(btnNewButton);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 60, 791, 316);
		getContentPane().add(tabbedPane);
		
		JLabel lblNewLabel_1 = new JLabel("\u5E8F\u53F7");
		lblNewLabel_1.setBounds(10, 408, 38, 15);
		getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(50, 405, 54, 21);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\u540D\u79F0");
		lblNewLabel_2.setBounds(125, 408, 46, 15);
		getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(173, 405, 54, 21);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\u83DC\u7CFB");
		lblNewLabel_3.setBounds(253, 408, 38, 15);
		getContentPane().add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(301, 405, 54, 21);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("\u5355\u4EF7");
		lblNewLabel_4.setBounds(381, 408, 38, 15);
		getContentPane().add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(429, 405, 54, 21);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("\u5355\u4F4D");
		lblNewLabel_5.setBounds(509, 408, 54, 15);
		getContentPane().add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.setBounds(562, 405, 46, 21);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("\u4FEE\u6539");
		btnNewButton_1.setBounds(641, 404, 61, 23);
		getContentPane().add(btnNewButton_1);
		
		JButton button = new JButton("\u5220\u9664");
		button.setBounds(720, 404, 61, 23);
		getContentPane().add(button);
	}
}
