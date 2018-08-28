
	package view;




	import java.awt.EventQueue;

	import javax.swing.JInternalFrame;

	public class ManagerEatForm extends JInternalFrame {

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
		public ManagerEatForm() {
			setMaximizable(true);
			setClosable(true);
			setTitle("\u83DC\u7CFB\u7BA1\u7406");
			setBounds(100, 100, 589, 411);
			getContentPane().setLayout(null);
		}

	}

