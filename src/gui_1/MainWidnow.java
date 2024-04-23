package gui_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.UIManager;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JToolBar;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

public class MainWidnow {

	private JFrame frmThebaldalliance;
	private JTextField UsernameTextField_LogIn_MainWindow;
	private JPasswordField passwordField_LogIn_MainWindow;
	private JTextField UsernameTextField_SignUp_MainWindow;
	private JTextField passwordField_SignUp_MainWindow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWidnow window = new MainWidnow();
					window.frmThebaldalliance.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWidnow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmThebaldalliance = new JFrame();
		frmThebaldalliance.getContentPane().setBackground(new Color(102, 102, 255));
		frmThebaldalliance.setBackground(new Color(51, 102, 255));
		frmThebaldalliance.setForeground(new Color(51, 102, 255));
		frmThebaldalliance.setTitle("TheBaldAlliance");
		frmThebaldalliance.setBounds(100, 100, 926, 601);
		frmThebaldalliance.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmThebaldalliance.getContentPane().setLayout(null);
		
		JLabel Title_MainWindow = new JLabel("The Bald Alliance");
		Title_MainWindow.setBounds(287, 23, 360, 39);
		Title_MainWindow.setFont(new Font("Segoe UI Black", Font.BOLD, 38));
		frmThebaldalliance.getContentPane().add(Title_MainWindow);
		
		JPanel panelLogIn_MainWindow = new JPanel();
		panelLogIn_MainWindow.setBounds(52, 171, 360, 297);
		panelLogIn_MainWindow.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 153), new Color(0, 0, 153), new Color(0, 0, 0), new Color(0, 0, 0)));
		panelLogIn_MainWindow.setBackground(UIManager.getColor("Button.light"));
		frmThebaldalliance.getContentPane().add(panelLogIn_MainWindow);
		panelLogIn_MainWindow.setLayout(null);
		
		JLabel LoginTitle_MainWindow = new JLabel("LOG IN");
		LoginTitle_MainWindow.setBounds(134, 11, 97, 36);
		panelLogIn_MainWindow.add(LoginTitle_MainWindow);
		LoginTitle_MainWindow.setFont(new Font("Sitka Small", Font.BOLD, 24));
		
		JLabel UsernameLogIn_MainWindow = new JLabel("USERNAME:");
		UsernameLogIn_MainWindow.setFont(new Font("Tahoma", Font.PLAIN, 15));
		UsernameLogIn_MainWindow.setBounds(21, 83, 91, 14);
		panelLogIn_MainWindow.add(UsernameLogIn_MainWindow);
		
		UsernameTextField_LogIn_MainWindow = new JTextField();
		UsernameTextField_LogIn_MainWindow.setBackground(new Color(255, 255, 255));
		UsernameTextField_LogIn_MainWindow.setBounds(118, 82, 171, 20);
		panelLogIn_MainWindow.add(UsernameTextField_LogIn_MainWindow);
		UsernameTextField_LogIn_MainWindow.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("PASSWORD:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(21, 136, 91, 14);
		panelLogIn_MainWindow.add(lblNewLabel);
		
		passwordField_LogIn_MainWindow = new JPasswordField();
		passwordField_LogIn_MainWindow.setBackground(new Color(255, 255, 255));
		passwordField_LogIn_MainWindow.setBounds(118, 135, 171, 20);
		panelLogIn_MainWindow.add(passwordField_LogIn_MainWindow);
		//---Lógica de Interraciones---
		
			//-Lógica de Botön Log In-
		JButton btn_Login_MainWindow = new JButton("Log In");
		btn_Login_MainWindow.setBackground(UIManager.getColor("ScrollBar.background"));
		btn_Login_MainWindow.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_Login_MainWindow.setBackground(new Color(0, 51, 255));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btn_Login_MainWindow.setBackground(UIManager.getColor("ScrollBar.background"));	
			}
		});
		btn_Login_MainWindow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Un If que verifica la base de datos, abre otra window
				if((UsernameTextField_LogIn_MainWindow.getText().equals("Hola")) || (passwordField_LogIn_MainWindow.getText().equals("12345"))) {
					
				} else {
					JOptionPane.showMessageDialog(frmThebaldalliance, "The username or the passwrod is incorrect");
				}
			}
		});
		
		
		
		btn_Login_MainWindow.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_Login_MainWindow.setBounds(134, 201, 89, 23);
		panelLogIn_MainWindow.add(btn_Login_MainWindow);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 153), new Color(0, 0, 153), new Color(0, 0, 0), new Color(0, 0, 0)));
		panel.setBounds(478, 171, 360, 297);
		frmThebaldalliance.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel SingUpTitle_MainWindow = new JLabel("NEW? SIGN UP");
		SingUpTitle_MainWindow.setBounds(88, 11, 189, 31);
		SingUpTitle_MainWindow.setFont(new Font("Sitka Small", Font.BOLD, 24));
		panel.add(SingUpTitle_MainWindow);
		
		JLabel UsernameSignUp_MainWindow = new JLabel("USERNAME:");
		UsernameSignUp_MainWindow.setFont(new Font("Tahoma", Font.PLAIN, 15));
		UsernameSignUp_MainWindow.setBounds(23, 83, 91, 14);
		panel.add(UsernameSignUp_MainWindow);
		
		UsernameTextField_SignUp_MainWindow = new JTextField();
		UsernameTextField_SignUp_MainWindow.setColumns(10);
		UsernameTextField_SignUp_MainWindow.setBackground(Color.WHITE);
		UsernameTextField_SignUp_MainWindow.setBounds(121, 82, 171, 20);
		panel.add(UsernameTextField_SignUp_MainWindow);
		
		passwordField_SignUp_MainWindow = new JTextField();
		passwordField_SignUp_MainWindow.setColumns(10);
		passwordField_SignUp_MainWindow.setBackground(Color.WHITE);
		passwordField_SignUp_MainWindow.setBounds(121, 126, 171, 20);
		panel.add(passwordField_SignUp_MainWindow);
		
		JLabel password_SignUp_MainWindow = new JLabel("PASSWORD:");
		password_SignUp_MainWindow.setFont(new Font("Tahoma", Font.PLAIN, 15));
		password_SignUp_MainWindow.setBounds(23, 127, 91, 14);
		panel.add(password_SignUp_MainWindow);
	}
}
