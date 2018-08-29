package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import java.awt.Color;
import java.awt.Component;

public class MainForm extends JFrame {

	private JPanel contentPane;
	JDesktopPane table = new JDesktopPane();
	
    
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainForm frame = new MainForm();
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
	public MainForm() {
//		setAlwaysOnTop(true);
		setTitle("\u9910\u996E\u7BA1\u7406\u7CFB\u7EDF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 844, 544);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 828, 21);
		contentPane.add(menuBar);
		
		JMenu menu = new JMenu("\u9910\u53F0\u7BA1\u7406");
		menuBar.add(menu);
		
		
		
		JMenuItem addBookType = new JMenuItem("\u67E5\u8BE2\u9910\u53F0");
		addBookType.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
			}
		});
		menu.add(addBookType);
		
		JMenuItem typeMangerMenu = new JMenuItem("\u589E\u52A0\u9910\u53F0");
		typeMangerMenu.setForeground(Color.BLACK);
		typeMangerMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddEatNumForm form = new AddEatNumForm();
				form.setVisible(true);
				table.add(form);
			}
		});
		menu.add(typeMangerMenu);
		
		
		
		
		
		JMenu mnNewMenu = new JMenu("\u83DC\u5355\u7BA1\u7406");
		menuBar.add(mnNewMenu);
		
		JMenuItem menuItem_2 = new JMenuItem("\u70B9\u9910");
		menuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChoseEatForm form = new ChoseEatForm();
				form.setVisible(true);
				table.add(form);
			}
		});
		mnNewMenu.add(menuItem_2);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("\u7ED3\u8D26");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PayForm form = new PayForm();
				form.setVisible(true);
				table.add(form);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		
		
		JMenu mnNewMenu_1 = new JMenu("\u83DC\u54C1\u7BA1\u7406");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("\u67E5\u770B\u83DC\u54C1");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CheckEatForm form = new CheckEatForm();
				form.setVisible(true);
				table.add(form);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("\u6DFB\u52A0\u83DC\u54C1");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InsertEatForm form = new InsertEatForm();
				form.setVisible(true);
				table.add(form);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		
		
		JMenu mnNewMenu_2 = new JMenu("\u83DC\u7CFB\u7BA1\u7406");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("\u83DC\u7CFB\u7BA1\u7406");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagerEatForm form = new ManagerEatForm();
				form.setVisible(true);
				table.add(form);
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_3);
		
		
		
		JMenu mnNewMenu_3 = new JMenu("\u7528\u6237\u7BA1\u7406");
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("\u589E\u52A0\u7528\u6237");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddUserForm form = new AddUserForm();
				form.setVisible(true);
				table.add(form);
			}
		});
		mnNewMenu_3.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("\u67E5\u8BE2\u7528\u6237");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CheckUserForm form = new CheckUserForm();
				form.setVisible(true);
				table.add(form);
			}
		});
		mnNewMenu_3.add(mntmNewMenuItem_5);
		table.setBackground(Color.WHITE);
		
		
		
		table.setBounds(0, 20, 828, 486);
		contentPane.add(table);
		
	}
}
