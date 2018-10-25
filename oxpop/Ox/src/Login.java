import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame{
	private JPanel contentPane;
	private JTextField loginUsername;
	private JPasswordField loginPassword;

	/**
	 * Launch the application.
	 */
	public static void showLogin() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		setTitle("OXGAME");

		setResizable(false);
		setMaximumSize(new Dimension(1024, 720));
		setBounds(100, 100, 1011, 706);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		contentPane = new JPanel();
		contentPane.setBounds(0, 0, 1003, 672);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		loginUsername = new JTextField();
		loginUsername.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				loginUsername.setText("");
			}
		});
		loginUsername.setText(" ");
		loginUsername.setBackground(new Color(255, 255, 224));
		loginUsername.setForeground(new Color(205, 133, 63));
		loginUsername.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 40));
		loginUsername.setBounds(670, 304, 244, 55);
		contentPane.add(loginUsername);
		loginUsername.setColumns(10);
		
		LoginService logins = new LoginService();
		JButton button_Login = new JButton("LOGIN");
		button_Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (logins.checkLogin(loginUsername.getText(), new String(loginPassword.getPassword())) == true) {
					logins.setLobby(loginUsername.getText());
					setVisible(false);
				} else {
					JOptionPane.showMessageDialog(null, "Username and Password incorrect!!");
				}	

			}
		});
		button_Login.setForeground(Color.WHITE);
		button_Login.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 40));
		button_Login.setBackground(new Color(205, 133, 63));
		button_Login.setBounds(567, 444, 232, 66);
		contentPane.add(button_Login);
		
		loginPassword = new JPasswordField();
		// login_password.setText("PASSWORD");
		loginPassword.setFont(new Font("Tahoma", Font.PLAIN, 30));
		loginPassword.setBackground(new Color(255, 255, 224));
		loginPassword.setForeground(new Color(205, 133, 63));
		loginPassword.setBounds(670, 372, 244, 54);
		contentPane.add(loginPassword);
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				Home home = new Home();
				home.showHome();
				
			}
		});
		JLabel lblNewLabel_10 = new JLabel("USERNAME");
		lblNewLabel_10.setForeground(new Color(153, 102, 51));
		lblNewLabel_10.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 30));
		lblNewLabel_10.setBounds(420, 316, 238, 38);
		contentPane.add(lblNewLabel_10);
		lblNewLabel_2.setIcon(new ImageIcon(Login.class.getResource("/photo/home.png")));
		lblNewLabel_2.setBounds(12, 13, 60, 55);
		contentPane.add(lblNewLabel_2);

		JLabel lblPassword_1 = new JLabel("PASSWORD");
		lblPassword_1.setForeground(new Color(153, 102, 51));
		lblPassword_1.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 30));
		lblPassword_1.setBounds(420, 380, 238, 38);
		contentPane.add(lblPassword_1);
		
		JLabel login_background = new JLabel("");
		login_background.setIcon(new ImageIcon(Login.class.getResource("/photo/backHome.png")));
		login_background.setBounds(0, 0, 1003, 672);
		contentPane.add(login_background);
		contentPane.setLayout(null);
		
	}

}