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
import entity.Eat;

public class AddEatNumForm extends JInternalFrame {
	
	private JTable table;

	private JPanel panel;
	
	private JScrollPane scrollPane;
	private JTextField txId;
	private JTextField tfTypeName;
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
	setBounds(100, 100, 589, 411);
	getContentPane().setLayout(null);
}
}
