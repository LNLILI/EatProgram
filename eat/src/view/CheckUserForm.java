package view;


	import java.awt.Component;
import java.awt.EventQueue;

	import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import entity.User;
import userccc.usercc;
import util.DBUTil;

import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JTable;

	public class CheckUserForm extends JInternalFrame {
		private JTextField textField;
		private JTextField textField_1;
		private JTextField textField_2;
		private static JTable table;

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
		public CheckUserForm() {
			setMaximizable(true);
			setClosable(true);
			setTitle("\u67E5\u8BE2\u7528\u6237");
			setBounds(100, 100, 727, 411);
			getContentPane().setLayout(null);
			
			JLabel lblNewLabel = new JLabel("\u59D3\u540D\uFF1A");
			lblNewLabel.setBounds(42, 25, 41, 15);
			getContentPane().add(lblNewLabel);
			
			textField = new JTextField();
			textField.setBounds(93, 22, 112, 21);
			getContentPane().add(textField);
			textField.setColumns(10);
			
			JButton btnNewButton = new JButton("\u67E5\u8BE2");
			
			btnNewButton.setBounds(232, 21, 78, 23);
			getContentPane().add(btnNewButton);
			
			JLabel lblNewLabel_1 = new JLabel("\u7528\u6237\u540D\uFF1A");
			lblNewLabel_1.setBounds(21, 337, 54, 15);
			getContentPane().add(lblNewLabel_1);
			
			textField_1 = new JTextField();
			textField_1.setEnabled(false);
			textField_1.setBounds(85, 334, 66, 21);
			getContentPane().add(textField_1);
			textField_1.setColumns(10);
			
			JLabel lblNewLabel_2 = new JLabel("\u59D3\u540D\uFF1A");
			lblNewLabel_2.setBounds(164, 337, 41, 15);
			getContentPane().add(lblNewLabel_2);
			
			textField_2 = new JTextField();
			textField_2.setEnabled(false);
			textField_2.setBounds(225, 334, 66, 21);
			getContentPane().add(textField_2);
			textField_2.setColumns(10);
			
			JLabel lblNewLabel_3 = new JLabel("\u6027\u522B\uFF1A");
			lblNewLabel_3.setBounds(310, 337, 46, 15);
			getContentPane().add(lblNewLabel_3);
			
			JRadioButton rdbtnNewRadioButton = new JRadioButton("\u7537");
			rdbtnNewRadioButton.setEnabled(false);
			rdbtnNewRadioButton.setBounds(380, 333, 41, 23);
			getContentPane().add(rdbtnNewRadioButton);
			
			JRadioButton radioButton = new JRadioButton("\u5973");
			radioButton.setEnabled(false);
			radioButton.setBounds(438, 333, 41, 23);
			getContentPane().add(radioButton);
			
			JButton btnNewButton_1 = new JButton("\u4FEE\u6539\u5BC6\u7801");
			btnNewButton_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
				}
			});
			btnNewButton_1.setBounds(506, 333, 86, 23);
			getContentPane().add(btnNewButton_1);
			
			JButton btnNewButton_2 = new JButton("\u5220\u9664");
			btnNewButton_2.setBounds(609, 333, 66, 23);
			getContentPane().add(btnNewButton_2);
			
			table = new JTable();
			table.setBounds(42, 81, 631, 232);
			Connection conn = null;
			PreparedStatement pstm = null;
			ResultSet rs=null;
			String sql1="select * from user";
			
			Vector vv=new Vector();
			Vector vv1=new Vector();
			Vector vv2=new Vector();
				try {
					conn=DBUTil.getConn();
					pstm = conn.prepareStatement(sql1);
					rs=pstm.executeQuery();
					vv2.add("用户名");
					vv2.add("真实姓名");
					vv2.add("性别");
					vv2.add("密码");
					vv2.add("注册时间");
					vv.add(vv2);
					while(rs.next()){
						vv1=new Vector();
						vv1.add(rs.getString("use_name"));
						vv1.add(rs.getString("use_realname"));
						vv1.add(rs.getString("use_gender"));
						vv1.add(rs.getString("use_pwd"));
						vv1.add(null);
						vv.add(vv1);
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				model.setDataVector(vv, vv1);
			getContentPane().add(table);
			btnNewButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					String name="";
					Connection conn = null;
					PreparedStatement pstm = null;
					ResultSet rs=null;
					usercc user1 =new usercc();
					user1.setUse_name(textField.getText());
					String sql="select * from user where use_name=?";
					String sql1="select * from user";
					Vector v=new Vector();
					Vector v1=new Vector();
					Vector v2=new Vector();
						try {
							conn=DBUTil.getConn();
							pstm = conn.prepareStatement(sql);
							pstm.setString(1, user1.getUse_name());
							rs=pstm.executeQuery();
							rs.next();
							user1.setUse_name(rs.getString("use_name"));
							user1.setUse_realname(rs.getString("use_realname"));
							user1.setUse_gender(rs.getString("use_gender"));
							user1.setUse_pwd(rs.getString("use_pwd"));
							user1.setUse_reg(null);
							v2.add("用户名");
							v2.add("真实姓名");
							v2.add("性别");
							v2.add("密码");
							v2.add("注册时间");
							v1.add(rs.getString("use_name"));
							v1.add(rs.getString("use_realname"));
							v1.add(rs.getString("use_gender"));
							v1.add(rs.getString("use_pwd"));
							v1.add(null);
							v.add(v2);
							v.add(v1);
							
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						DefaultTableModel model = (DefaultTableModel)table.getModel();
						model.setDataVector(v, v1);
						int row = table.getSelectedRow();
						getContentPane().add(table);
						/*String userName=table.getValueAt(row,0).toString();
						String typeRealname = table.getValueAt(row,1).toString();
						String usergender = table.getValueAt(row, 2).toString();
						String userpwd = table.getValueAt(row, 3).toString();*/
						
				}
			});
			
		}
	}
