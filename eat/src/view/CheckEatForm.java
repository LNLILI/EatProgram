package view;




import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import dao.caipinDao;
import dao.impl.caipinDaoimpl;
import entity.food;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JFormattedTextField;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CheckEatForm extends JInternalFrame {
	private JTextField tf;
	private JTextField tf_no;
	private JTextField tf_name;
	private JTextField tf_cuis;
	private JTextField tf_price;
	private JTextField tf_unit;
	private JTable table;

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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 56, 791, 320);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// JOptionPane.showMessageDialog(null, "ok");
				// 得到选中行数
				int row = table.getSelectedRow();
				String no = table.getValueAt(row, 0).toString();
				String name = table.getValueAt(row,1).toString();
				String cuis = table.getValueAt(row,2).toString();
				String price = table.getValueAt(row,4).toString();
				String unit = table.getValueAt(row,3).toString();
				
				tf_no.setText(no);
				tf_name.setText(name);
				tf_cuis.setText(cuis);
				tf_price.setText(price);
				tf_unit.setText(unit);
			}
		});
		table.setBounds(10, 56, 791, 320);
		scrollPane.setViewportView(table);
		
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		caipinDao dao = new caipinDaoimpl();
		Vector v=new Vector();
		v.add("菜号");
		v.add("菜名");
		v.add("菜系");
		v.add("单位");
		v.add("单价");
		model.setDataVector(dao.select(), v);
		table.setModel(model);
		
		
		JLabel lblNewLabel = new JLabel("\u540D\u79F0:");
		lblNewLabel.setBounds(79, 28, 54, 15);
		getContentPane().add(lblNewLabel);
		
		tf = new JTextField();
		tf.setBounds(143, 25, 104, 21);
		getContentPane().add(tf);
		tf.setColumns(10);
		
		JButton btnNewButton = new JButton("\u67E5\u627E");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vector v=new Vector();
				v.add("菜号");
				v.add("菜名");
				v.add("菜系");
				v.add("单位");
				v.add("单价");
				if(tf.getText()!=null){
					model.setDataVector(dao.select0(tf.getText()), v);
					table.setModel(model);
				}
//				else{				
//					model.setDataVector(dao.select(), v);
//					table.setModel(model);
//				}
				
				
			}
		});
		btnNewButton.setBounds(641, 24, 68, 23);
		getContentPane().add(btnNewButton);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 60, 791, 316);
		getContentPane().add(tabbedPane);
		
		JLabel lblNewLabel_1 = new JLabel("\u5E8F\u53F7");
		lblNewLabel_1.setBounds(10, 408, 38, 15);
		getContentPane().add(lblNewLabel_1);
		
		tf_no = new JTextField();
		tf_no.setEditable(false);
		tf_no.setBounds(50, 405, 54, 21);
		getContentPane().add(tf_no);
		tf_no.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\u540D\u79F0");
		lblNewLabel_2.setBounds(125, 408, 46, 15);
		getContentPane().add(lblNewLabel_2);
		
		tf_name = new JTextField();
		tf_name.setBounds(173, 405, 54, 21);
		getContentPane().add(tf_name);
		tf_name.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\u83DC\u7CFB");
		lblNewLabel_3.setBounds(253, 408, 38, 15);
		getContentPane().add(lblNewLabel_3);
		
		tf_cuis = new JTextField();
		tf_cuis.setBounds(301, 405, 54, 21);
		getContentPane().add(tf_cuis);
		tf_cuis.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("\u5355\u4EF7");
		lblNewLabel_4.setBounds(381, 408, 38, 15);
		getContentPane().add(lblNewLabel_4);
		
		tf_price = new JTextField();
		tf_price.setBounds(429, 405, 54, 21);
		getContentPane().add(tf_price);
		tf_price.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("\u5355\u4F4D");
		lblNewLabel_5.setBounds(509, 408, 54, 15);
		getContentPane().add(lblNewLabel_5);
		
		tf_unit = new JTextField();
		tf_unit.setEditable(false);
		tf_unit.setBounds(562, 405, 46, 21);
		getContentPane().add(tf_unit);
		tf_unit.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("\u4FEE\u6539");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String no = tf_no.getText();
				String name = tf_name.getText();
				String cuis = tf_cuis.getText();
				String price = tf_price.getText();
				String unit = tf_unit.getText();
				food f = new food();
				f.setFoodid(no);
				f.setFoodname(name);
				f.setCuisinesid(cuis);
				f.setPrice(price);
				f.setUnit(unit);
				int i =dao.update(f);
				if(i==1){
					JOptionPane.showMessageDialog(null, "修改成功");
					DefaultTableModel model = (DefaultTableModel)table.getModel();
					model.setDataVector(dao.select(), v);
					table.setModel(model);
				}else{
					JOptionPane.showMessageDialog(null, "修改失败");
				}
			}
		});
		btnNewButton_1.setBounds(641, 404, 61, 23);
		getContentPane().add(btnNewButton_1);
		
		JButton button = new JButton("\u5220\u9664");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String no = tf_no.getText();
				int i =dao.delete(no);
				if(i==1){
					JOptionPane.showConfirmDialog(null, "是否删除");
					DefaultTableModel model = (DefaultTableModel)table.getModel();
					model.setDataVector(dao.select(), v);
					table.setModel(model);
				}else{
					JOptionPane.showMessageDialog(null, "删除失败");
				}
				
			}
		});
		button.setBounds(720, 404, 61, 23);
		getContentPane().add(button);
	}
}
