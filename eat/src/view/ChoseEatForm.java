package view;



import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.DefaultComboBoxModel;

public class ChoseEatForm extends JInternalFrame {
	private JTextField ÅÌ;
	private JTextField textField_1;

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
		setBounds(100, 100, 477, 361);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u53F0\u53F7:");
		lblNewLabel.setBounds(139, 70, 54, 15);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u83DC\u54C1\u540D:");
		lblNewLabel_1.setBounds(139, 113, 54, 15);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u5355\u4F4D:");
		lblNewLabel_2.setBounds(139, 157, 54, 15);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u6570\u91CF:");
		lblNewLabel_3.setBounds(139, 192, 54, 15);
		getContentPane().add(lblNewLabel_3);
		
		JLabel label = new JLabel("\u5355\u4EF7:");
		label.setBounds(139, 232, 54, 15);
		getContentPane().add(label);
		
		ÅÌ = new JTextField();
		ÅÌ.setEnabled(false);
		ÅÌ.setText("\u76D8");
		ÅÌ.setBounds(236, 154, 105, 21);
		getContentPane().add(ÅÌ);
		ÅÌ.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setText("120");
		textField_1.setBounds(236, 229, 105, 21);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("\u786E\u5B9A");
		btnNewButton.setBounds(182, 278, 93, 23);
		getContentPane().add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(236, 64, 105, 21);
		getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"\u7EA2\u70E7\u72EE\u5B50\u5934", "1", "2", "3", "4", "5 "}));
		comboBox_1.setBounds(236, 110, 105, 21);
		getContentPane().add(comboBox_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Integer(1), null, null, new Integer(1)));
		spinner.setBounds(236, 189, 105, 22);
		getContentPane().add(spinner);
	}
}

