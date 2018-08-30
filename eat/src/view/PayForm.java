package view;




import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import dao.caixiDao;
import dao.menuItemsDao;
import dao.impl.caixiDaoimpl;
import dao.impl.menuItemsDaoImpl;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class PayForm extends JInternalFrame {
	
	private JTextField txId;
	private JTextField textField_1;
	private JTable tableMenu;
	private JTable table;

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
		
		setBounds(100, 100, 792, 388);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 776, 359);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u83DC  \u5355");
		lblNewLabel.setFont(new Font("楷体", Font.PLAIN, 27));
		lblNewLabel.setBounds(20, 10, 93, 31);
		panel.add(lblNewLabel);
		
		JLabel label = new JLabel("\u660E  \u7EC6");
		label.setFont(new Font("楷体", Font.PLAIN, 27));
		label.setBounds(442, 10, 93, 31);
		panel.add(label);
		
		JScrollPane scrollPane1 = new JScrollPane();
		scrollPane1.setBounds(10, 42, 338, 267);
		panel.add(scrollPane1);
		
		tableMenu = new JTable();
//		tableMenu.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				int row = tableMenu.getSelectedRow();
//				String id = tableMenu.getValueAt(row, 0).toString();
//				String typeName = tableMenu.getValueAt(row,1).toString();
//				txId.setText(id);
//				textField_1.setText(typeName);;
//			}
//		});
		
		
		DefaultTableModel model = (DefaultTableModel)tableMenu.getModel();
		menuItemsDao  dao = new menuItemsDaoImpl();
		Vector v=new Vector();
		v.add("菜单号");
		v.add("餐台号");
		v.add("开台时间");
		v.add("消费总金额");
		v.add("是否结账");
		v.add("操作人");
		model.setDataVector(dao.end(), v);
		tableMenu.setModel(model);
		tableMenu.setBounds(10, 42, 338, 267);
		scrollPane1.setViewportView(tableMenu);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(414, 42, 331, 267);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("\u5237\u65B0");
		btnNewButton.setBounds(457, 326, 93, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u7ED3\u8D26");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "结账成功");
				
			}
		});
		btnNewButton_1.setBounds(628, 326, 93, 23);
		panel.add(btnNewButton_1);
		
	}
}
