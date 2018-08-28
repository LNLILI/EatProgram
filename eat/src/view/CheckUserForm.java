package view;


	import java.awt.EventQueue;

	import javax.swing.JInternalFrame;

	public class CheckUserForm extends JInternalFrame {

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
			setBounds(100, 100, 589, 411);
			getContentPane().setLayout(null);
		}

	}
