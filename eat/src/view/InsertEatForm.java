package view;




import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class InsertEatForm extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

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
	public InsertEatForm() {
		setMaximizable(true);
		setClosable(true);
		setTitle("\u6DFB\u52A0\u83DC\u54C1");
		setBounds(100, 100, 632, 168);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u83DC\u53F7");
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 12));
		lblNewLabel.setBounds(26, 39, 24, 15);
		getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("\u83DC\u540D");
		label.setFont(new Font("����", Font.PLAIN, 12));
		label.setBounds(144, 39, 24, 15);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\u83DC\u7CFB");
		label_1.setFont(new Font("����", Font.PLAIN, 12));
		label_1.setBounds(262, 39, 24, 15);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\u5355\u4F4D");
		label_2.setFont(new Font("����", Font.PLAIN, 12));
		label_2.setBounds(374, 39, 24, 15);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("\u4EF7\u683C");
		label_3.setFont(new Font("����", Font.PLAIN, 12));
		label_3.setBounds(490, 39, 24, 15);
		getContentPane().add(label_3);
		
		textField = new JTextField();
		textField.setBounds(60, 36, 66, 21);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(178, 36, 66, 21);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(408, 36, 66, 21);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(524, 36, 66, 21);
		getContentPane().add(textField_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("����", Font.PLAIN, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u82CF\u83DC", "\u5DDD\u83DC", "\u4E1C\u5317\u83DC", "\u7CA4\u83DC", "\u6E58\u83DC", "\u91CD\u5E86\u83DC"}));
		comboBox.setBounds(296, 36, 68, 21);
		getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("\u6DFB\u52A0");
		btnNewButton.setFont(new Font("����", Font.PLAIN, 12));
		btnNewButton.setBounds(497, 91, 93, 23);
		getContentPane().add(btnNewButton);
	}
}
