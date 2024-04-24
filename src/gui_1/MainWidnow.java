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
import javax.swing.JComboBox;
import javax.swing.ImageIcon;

public class MainWidnow {

	private JFrame frmThebaldalliance;
	private static JTextField UsernameTextField_LogIn_MainWindow;
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
		Title_MainWindow.setBounds(275, 21, 360, 39);
		Title_MainWindow.setFont(new Font("Segoe UI Black", Font.BOLD, 38));
		frmThebaldalliance.getContentPane().add(Title_MainWindow);
		
		JPanel panelLogIn_MainWindow = new JPanel();
		panelLogIn_MainWindow.setBounds(52, 207, 360, 297);
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
		UsernameLogIn_MainWindow.setBounds(46, 81, 91, 19);
		panelLogIn_MainWindow.add(UsernameLogIn_MainWindow);
		
		UsernameTextField_LogIn_MainWindow = new JTextField();
		UsernameTextField_LogIn_MainWindow.setBackground(new Color(255, 255, 255));
		UsernameTextField_LogIn_MainWindow.setBounds(136, 82, 171, 20);
		panelLogIn_MainWindow.add(UsernameTextField_LogIn_MainWindow);
		UsernameTextField_LogIn_MainWindow.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("PASSWORD:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(46, 136, 91, 14);
		panelLogIn_MainWindow.add(lblNewLabel);
		
		passwordField_LogIn_MainWindow = new JPasswordField();
		passwordField_LogIn_MainWindow.setBackground(new Color(255, 255, 255));
		passwordField_LogIn_MainWindow.setBounds(136, 135, 171, 20);
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
				//Un If que verifica la base de datos, abre otra window y cierra la que estaba
				if((UsernameTextField_LogIn_MainWindow.getText().equals("Usario_01")) || (passwordField_LogIn_MainWindow.getText().equals("12345"))) {
					OptionMenuWindow nw = new OptionMenuWindow();
					nw.newOptionWindow();
					frmThebaldalliance.dispose();
		
					
				} else {
					JOptionPane.showMessageDialog(frmThebaldalliance, "The username or the passwrod is incorrect");
				}
			}
		});
		
		
		
		btn_Login_MainWindow.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_Login_MainWindow.setBounds(134, 201, 89, 23);
		panelLogIn_MainWindow.add(btn_Login_MainWindow);
		
		JLabel Icon01_MainWindow = new JLabel("");
		Icon01_MainWindow.setBounds(10, 72, 46, 30);
		panelLogIn_MainWindow.add(Icon01_MainWindow);
		Icon01_MainWindow.setIcon(new ImageIcon("C:\\Users\\Diego\\Documents\\GitHub\\TheBaldAlliance\\img\\icons8-usuario-30.png"));
		
		JLabel icon02_Window = new JLabel("");
		icon02_Window.setBounds(10, 124, 46, 39);
		panelLogIn_MainWindow.add(icon02_Window);
		icon02_Window.setIcon(new ImageIcon("C:\\Users\\Diego\\Documents\\GitHub\\TheBaldAlliance\\img\\icons8-contraseña-30.png"));
		
		JPanel SignUpPanel_MainWindow = new JPanel();
		SignUpPanel_MainWindow.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 153), new Color(0, 0, 153), new Color(0, 0, 0), new Color(0, 0, 0)));
		SignUpPanel_MainWindow.setBounds(477, 207, 360, 297);
		frmThebaldalliance.getContentPane().add(SignUpPanel_MainWindow);
		SignUpPanel_MainWindow.setLayout(null);
		
		JLabel UsernameSignUp_MainWindow = new JLabel("USERNAME:");
		UsernameSignUp_MainWindow.setFont(new Font("Tahoma", Font.PLAIN, 15));
		UsernameSignUp_MainWindow.setBounds(45, 83, 91, 14);
		SignUpPanel_MainWindow.add(UsernameSignUp_MainWindow);
		
		UsernameTextField_SignUp_MainWindow = new JTextField();
		UsernameTextField_SignUp_MainWindow.setColumns(10);
		UsernameTextField_SignUp_MainWindow.setBackground(Color.WHITE);
		UsernameTextField_SignUp_MainWindow.setBounds(146, 82, 171, 20);
		SignUpPanel_MainWindow.add(UsernameTextField_SignUp_MainWindow);
		
		passwordField_SignUp_MainWindow = new JTextField();
		passwordField_SignUp_MainWindow.setColumns(10);
		passwordField_SignUp_MainWindow.setBackground(Color.WHITE);
		passwordField_SignUp_MainWindow.setBounds(146, 139, 171, 20);
		SignUpPanel_MainWindow.add(passwordField_SignUp_MainWindow);
		
		JLabel password_SignUp_MainWindow = new JLabel("PASSWORD:");
		password_SignUp_MainWindow.setFont(new Font("Tahoma", Font.PLAIN, 15));
		password_SignUp_MainWindow.setBounds(45, 140, 91, 14);
		SignUpPanel_MainWindow.add(password_SignUp_MainWindow);
			//Lógica del Botón de Sign Up
		JButton btn_SignUp_MainWindow = new JButton("Sign Up");
		btn_SignUp_MainWindow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btn_SignUp_MainWindow.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_SignUp_MainWindow.setBackground(new Color(0, 51, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btn_SignUp_MainWindow.setBackground(UIManager.getColor("ScrollBar.background"));
			}
		});
		btn_SignUp_MainWindow.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_SignUp_MainWindow.setBackground(UIManager.getColor("ScrollBar.background"));
		btn_SignUp_MainWindow.setBounds(139, 200, 89, 23);
		SignUpPanel_MainWindow.add(btn_SignUp_MainWindow);
		
		JLabel SingUpTitle_MainWindow = new JLabel("SIGN UP");
		SingUpTitle_MainWindow.setBounds(128, 11, 189, 31);
		SignUpPanel_MainWindow.add(SingUpTitle_MainWindow);
		SingUpTitle_MainWindow.setFont(new Font("Sitka Small", Font.BOLD, 24));
		
		JLabel icon03_MainWindow = new JLabel("");
		icon03_MainWindow.setIcon(new ImageIcon("C:\\Users\\Diego\\Documents\\GitHub\\TheBaldAlliance\\img\\icons8-usuario-30.png"));
		icon03_MainWindow.setBounds(10, 63, 46, 50);
		SignUpPanel_MainWindow.add(icon03_MainWindow);
		
		JLabel icon04_MainWindow = new JLabel("");
		icon04_MainWindow.setIcon(new ImageIcon("C:\\Users\\Diego\\Documents\\GitHub\\TheBaldAlliance\\img\\icons8-contraseña-30.png"));
		icon04_MainWindow.setBounds(10, 128, 46, 31);
		SignUpPanel_MainWindow.add(icon04_MainWindow);
		
		JLabel Image01_MainWindow = new JLabel("");
		Image01_MainWindow.setIcon(new ImageIcon("C:\\Users\\Diego\\Documents\\GitHub\\TheBaldAlliance\\img\\output-onlinepngtools (2).png"));
		Image01_MainWindow.setBounds(397, 68, 120, 141);
		frmThebaldalliance.getContentPane().add(Image01_MainWindow);
	}

	public static String getUsername() {
			String x = "Welcome: " + UsernameTextField_LogIn_MainWindow.getText();
		
			return x;
		
		}
	}

