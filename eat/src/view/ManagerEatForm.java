
	package view;




	import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import dao.caixiDao;
import dao.impl.caixiDaoimpl;
import entity.cuisines;
import entity.food;

import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

	public class ManagerEatForm extends JInternalFrame {
		private JTable table;
		private JPanel panel;
		private JTextField tf;
		private JTextField tf_name;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						ManagerEatForm frame = new ManagerEatForm();
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
		public ManagerEatForm() {
			setTitle("\u83DC\u7CFB\u7BA1\u7406");
			setMaximizable(true);
			setClosable(true);
			getContentPane().setLayout(null);
			setBounds(100, 100, 529, 369);
			
			
			
			
			panel = new JPanel();
			panel.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(panel);
			panel.setLayout(null);
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 58, 493, 196);
			panel.add(scrollPane);
			table = new JTable();
			table.setBounds(10, 58, 493, 196);
			scrollPane.setViewportView(table);
			table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					// JOptionPane.showMessageDialog(null, "ok");
					// 得到选中行数
					int row = table.getSelectedRow();
					String no = table.getValueAt(row, 0).toString();
					String name = table.getValueAt(row,1).toString();
					
					tf.setText(no);
					tf_name.setText(name);;
				}
			});
	        table.setBounds(10, 58, 493, 196);
			
			DefaultTableModel model = (DefaultTableModel)table.getModel();
			caixiDao  dao = new caixiDaoimpl();
			Vector v=new Vector();
			
			v.add("菜系号");
			v.add("菜系名");
			model.setDataVector(dao.select(), v);
			
			JLabel lblNewLabel = new JLabel("\u83DC\u7CFB\u53F7");
			lblNewLabel.setFont(new Font("楷体", Font.PLAIN, 12));
			lblNewLabel.setBounds(29, 33, 54, 15);
			panel.add(lblNewLabel);
			
			
			JLabel lblNewLabel_1 = new JLabel("\u83DC\u7CFB\u540D");
			lblNewLabel_1.setFont(new Font("楷体", Font.PLAIN, 12));
			lblNewLabel_1.setBounds(304, 33, 54, 15);
			panel.add(lblNewLabel_1);
			
			tf = new JTextField();
			tf.setBounds(94, 30, 112, 21);
			panel.add(tf);
			tf.setColumns(10);
			
			tf_name = new JTextField();
			tf_name.setBounds(368, 30, 112, 21);
			panel.add(tf_name);
			tf_name.setColumns(10);
			
			JButton btnNewButton = new JButton("\u67E5\u8BE2");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Vector v=new Vector();
					v.add("菜系号");
					v.add("菜系名");
					
					if(tf.getText()!=null){
						model.setDataVector(dao.select1((tf.getText())), v);
						table.setModel(model);
					}
				}
			});
			btnNewButton.setBounds(279, 283, 68, 23);
			panel.add(btnNewButton);
			
			JButton btnNewButton_1 = new JButton("\u4FEE\u6539");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String no = tf.getText();
					String name = tf_name.getText();
					cuisines c = new cuisines();
					c.setCuisinesid(no);
					c.setCuisinesname(name);
					int i =dao.update(c);
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
			btnNewButton_1.setBounds(357, 283, 68, 23);
			panel.add(btnNewButton_1);
			
			JButton btnNewButton_2 = new JButton("\u5220\u9664");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "菜系无法删除");
				}
			});

			btnNewButton_2.setBounds(435, 283, 68, 23);
			panel.add(btnNewButton_2);
			
			
		}

	}

