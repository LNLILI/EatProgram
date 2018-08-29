package view;


	import java.awt.EventQueue;

	import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

	public class AddUserForm extends JInternalFrame {
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
		public AddUserForm() {
			setMaximizable(true);
			setClosable(true);
			setTitle("\u6DFB\u52A0\u7528\u6237");
			setBounds(100, 100, 436, 432);
			getContentPane().setLayout(null);
			
			JLabel lblNewLabel = new JLabel("\u7528\u6237\u540D:");
			lblNewLabel.setBounds(83, 43, 42, 15);
			getContentPane().add(lblNewLabel);
			
			JLabel label = new JLabel("\u5BC6\u7801:");
			label.setBounds(83, 80, 37, 15);
			getContentPane().add(label);
			
			JLabel label_1 = new JLabel("\u786E\u8BA4\u5BC6\u7801:");
			label_1.setBounds(83, 117, 79, 15);
			getContentPane().add(label_1);
			
			JLabel label_2 = new JLabel("\u771F\u5B9E\u59D3\u540D:");
			label_2.setBounds(83, 157, 79, 15);
			getContentPane().add(label_2);
			
			JLabel label_3 = new JLabel("\u6027\u522B:");
			label_3.setBounds(83, 196, 30, 15);
			getContentPane().add(label_3);
			
			JButton button = new JButton("\u6CE8\u518C");
			button.setBounds(114, 259, 77, 23);
			getContentPane().add(button);
			
			JButton button_1 = new JButton("\u8FD4\u56DE");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			button_1.setBounds(222, 259, 77, 23);
			getContentPane().add(button_1);
			
			JRadioButton rdbtnNewRadioButton = new JRadioButton("\u7537");
			rdbtnNewRadioButton.setBounds(161, 192, 54, 23);
			getContentPane().add(rdbtnNewRadioButton);
			
			JRadioButton radioButton = new JRadioButton("\u5973");
			radioButton.setBounds(222, 192, 54, 23);
			getContentPane().add(radioButton);
			
			textField = new JTextField();
			textField.setBounds(172, 40, 140, 21);
			getContentPane().add(textField);
			textField.setColumns(10);
			
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(172, 77, 140, 21);
			getContentPane().add(textField_1);
			
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(172, 114, 140, 21);
			getContentPane().add(textField_2);
			
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(172, 154, 140, 21);
			getContentPane().add(textField_3);
		}
	}
