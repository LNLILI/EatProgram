package view;


	import java.awt.EventQueue;

	import javax.swing.JInternalFrame;

	public class AddUserForm extends JInternalFrame {

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
		public AddUserForm() {
			setMaximizable(true);
			setClosable(true);
			setTitle("\u589E\u52A0\u7528\u6237");
			setBounds(100, 100, 589, 411);
			getContentPane().setLayout(null);
		}

	}
