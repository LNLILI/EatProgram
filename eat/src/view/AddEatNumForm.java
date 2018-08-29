package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import dao.NumDao;
import dao.impl.NumDaoImpl;
import dao.impl.tableDaoImpl;
import entity.Eat;
import entity.Table;

public class AddEatNumForm extends JInternalFrame {
	
	private JTable table;

	private JPanel panel;
	
	private JScrollPane scrollPane;
	private JTextField txId;
	private JTextField tfTypeName;
	private JTextField textField;
	private JTextField textField_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddEatNumForm frame = new AddEatNumForm();
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
public AddEatNumForm() {
	setMaximizable(true);
	setClosable(true);
	setTitle("\u589E\u52A0\u9910\u53F0");
	setBounds(100, 100, 430, 255);
	getContentPane().setLayout(null);
	
	JLabel label2 = new JLabel("\u9910\u53F0\u53F7:");
	label2.setBounds(119, 66, 54, 15);
	getContentPane().add(label2);
	
	JLabel label = new JLabel("\u5EA7\u4F4D\u6570:");
	label.setBounds(119, 95, 54, 15);
	getContentPane().add(label);
	
	textField = new JTextField();
	textField.setBounds(166, 63, 118, 21);
	getContentPane().add(textField);
	textField.setColumns(10);
	
	textField_1 = new JTextField();
	textField_1.setBounds(166, 92, 118, 21);
	getContentPane().add(textField_1);
	textField_1.setColumns(10);
	
	JButton button = new JButton("\u589E\u52A0");                         
	button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			Table ta1=new Table();
			ta1.setTableid(textField.getText());
			ta1.setSeatnym(Integer.parseInt(textField_1.getText()));
			tableDaoImpl ta2=new tableDaoImpl();
			ta2.addTable(ta1);
			JOptionPane.showMessageDialog(null, "�ɹ�");
		}
	});
	/*button.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent arg0) {
			
			Table ta1=new Table();
			ta1.setTableid(textField.getText());
			ta1.setSeatnym(Integer.parseInt(textField_1.getText()));
			tableDaoImpl ta2=new tableDaoImpl();
			ta2.addTable(ta1);
			JOptionPane.showMessageDialog(null, "�ɹ�");
		}
	});*/
	button.setBounds(131, 136, 64, 23);
	getContentPane().add(button);
	
	JButton btnNewButton = new JButton("\u8FD4\u56DE");
	btnNewButton.setBounds(205, 136, 64, 23);
	getContentPane().add(btnNewButton);
}
}
