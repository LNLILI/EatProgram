package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import dao.caixiDao;
import dao.impl.caixiDaoimpl;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class caixixialaform extends JFrame {
	
	private JTable table;
	private JPanel contentPane;
	private JTextField txId;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					caixixialaform frame = new caixixialaform();
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
	public caixixialaform() {
		setTitle("\u83DC\u7CFB\u7BA1\u7406");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 529, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				// JOptionPane.showMessageDialog(null, "ok");
				// 得到选中行数
				int row = table.getSelectedRow();
				String id = table.getValueAt(row, 0).toString();
				String typeName = table.getValueAt(row,1).toString();
				
				txId.setText(id);
				textField_1.setText(typeName);;
			}
		});
        table.setBounds(6, 58, 497, 196);
		
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		caixiDao  caixiDao = new caixiDaoimpl();
		Vector v=new Vector();
		
		v.add("菜系号");
		v.add("菜系名");
		model.setDataVector(caixiDao.select(), v);


		getContentPane().add(table);
		
		JLabel lblNewLabel = new JLabel("\u83DC\u7CFB\u53F7");
		lblNewLabel.setBounds(29, 33, 54, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u83DC\u7CFB\u540D");
		lblNewLabel_1.setBounds(304, 33, 54, 15);
		contentPane.add(lblNewLabel_1);
		
		txId = new JTextField();
		txId.setBounds(94, 30, 135, 21);
		contentPane.add(txId);
		txId.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(368, 30, 135, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("\u67E5\u8BE2");
		btnNewButton.setBounds(207, 283, 68, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u4FEE\u6539");
		btnNewButton_1.setBounds(304, 283, 68, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u5220\u9664");
		btnNewButton_2.setBounds(399, 283, 68, 23);
		contentPane.add(btnNewButton_2);
	}
}
