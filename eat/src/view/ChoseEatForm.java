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

import dao.caipinDao;
import dao.tableDao;
import dao.impl.caipinDaoimpl;
import dao.impl.menuItemsDaoImpl;
import dao.impl.tableDaoImpl;
import entity.Menu;
import entity.Menuitems;
import entity.food;
import util.DBUTil;

import javax.swing.ComboBoxEditor;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class ChoseEatForm extends JInternalFrame {
	private JTextField ел;
	private JTextField textField_1;
	private JTextField textField;

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
		
		ел = new JTextField();
		ел.setEnabled(false);
		ел.setText("\u76D8");
		ел.setBounds(236, 154, 105, 21);
		getContentPane().add(ел);
		ел.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setText("120");
		textField_1.setBounds(236, 229, 105, 21);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		
		
		JComboBox comboBox = new JComboBox();
	//	comboBox.setModel(new DefaultComboBoxModel(new String[] {"1001", "1002", "1003"}));
		tableDao dao=new tableDaoImpl();
		Vector v=dao.XL();
		comboBox.removeAllItems();
		for (int i = 0; i < v.size(); i++) {
			comboBox.addItem(v.get(i));
		}
		comboBox.setToolTipText("");
		comboBox.setBounds(236, 64, 105, 21);
		getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		//comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"\u7EA2\u70E7\u8089", "\u714E\u997C\u679C\u5B50", "\u7532\u9C7C\u7172\u4ED4\u996D", "\u5BAB\u4FDD\u9E21\u4E01"}));
		caipinDao dao1=new caipinDaoimpl();
		Vector v1=dao1.ROU();
		comboBox_1.removeAllItems();
		for (int i = 0; i < v1.size(); i++) {
			comboBox_1.addItem(v1.get(i));
		}
		comboBox_1.setBounds(236, 110, 105, 21);
		getContentPane().add(comboBox_1);
		
		JButton btnNewButton = new JButton("\u786E\u5B9A");
		btnNewButton.setBounds(182, 278, 93, 23);
		getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(236, 192, 105, 21);
		getContentPane().add(textField);
		textField.setColumns(10);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String no1="";
				Menuitems menu=new Menuitems();
				food food1=new food();
				Menu mm1=new Menu();
				String no=comboBox.getSelectedItem().toString();
				System.out.println("no:"+no);
				mm1.setTableId(no);
				String name=comboBox_1.getSelectedItem().toString();
				System.out.println("name:"+name);
				Connection conn = null;
				PreparedStatement pstm = null;
				ResultSet rs=null;
				String sql="select food_no from food where food_name=?";
				try {
					conn=DBUTil.getConn();
					pstm = conn.prepareStatement(sql);
					pstm.setString(1, name);
					rs=pstm.executeQuery();
					rs.next();
					no1=rs.getString("food_no");
					System.out.println("no1:"+no1);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				menu.setFoodName(no1);
				String sql1 = "insert into menuitems values(?,?,?,?,null)";
				int nono=203;
				nono++;
				menu.setAmount(Integer.parseInt(textField.getText()));
				System.out.println("amount:"+menu.getAmount());
				DBUTil.executeUpdate(sql1,nono,mm1.getTableId(),menu.getFoodName(),menu.getAmount());
				System.out.println("╣Ц╡мЁи╧╕");
			}
		});
	}
}

