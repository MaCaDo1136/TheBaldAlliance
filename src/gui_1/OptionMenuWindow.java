package gui_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.UIManager;

public class OptionMenuWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void newOptionWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OptionMenuWindow frame = new OptionMenuWindow();
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
	public OptionMenuWindow() {
		setTitle("TheBaldAlliance");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 926, 601);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 102, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel WelcomeITitle_OptionWindow = new JLabel(MainWidnow.getUsername());
		WelcomeITitle_OptionWindow.setFont(new Font("Sitka Small", Font.BOLD, 40));
		WelcomeITitle_OptionWindow.setBounds(10, 11, 634, 54);
		contentPane.add(WelcomeITitle_OptionWindow);

		JButton btnSearchTeams_OptionWindow = new JButton("SEARCH TEAM");
		btnSearchTeams_OptionWindow.setBackground(UIManager.getColor("Button.shadow"));
		btnSearchTeams_OptionWindow.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSearchTeams_OptionWindow.setBounds(126, 382, 300, 100);
		contentPane.add(btnSearchTeams_OptionWindow);

		JPanel panel = new JPanel();
		panel.setBounds(126, 167, 300, 204);
		contentPane.add(panel);

		JButton btnScoutingTeams_OptionWindow_1 = new JButton("SCOUT TEAM");
		btnScoutingTeams_OptionWindow_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnScoutingTeams_OptionWindow_1.setBackground(UIManager.getColor("Button.shadow"));
		btnScoutingTeams_OptionWindow_1.setBounds(492, 382, 300, 100);
		contentPane.add(btnScoutingTeams_OptionWindow_1);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(492, 167, 300, 204);
		contentPane.add(panel_1);
	}
}
