package view;




import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		setBounds(100, 100, 879, 411);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u83DC  \u5355");
		lblNewLabel.setFont(new Font("¿¬Ìå", Font.PLAIN, 27));
		lblNewLabel.setBounds(20, 10, 93, 31);
		getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("\u660E  \u7EC6");
		label.setFont(new Font("¿¬Ìå", Font.PLAIN, 27));
		label.setBounds(442, 10, 93, 31);
		getContentPane().add(label);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(20, 51, 376, 233);
		getContentPane().add(tabbedPane);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(452, 51, 399, 233);
		getContentPane().add(tabbedPane_1);
		
		JButton btnNewButton = new JButton("\u5237\u65B0");
		btnNewButton.setBounds(577, 325, 93, 23);
		getContentPane().add(btnNewButton);
		
		JButton button = new JButton("\u7ED3\u8D26");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(688, 325, 93, 23);
		getContentPane().add(button);
	}

}
