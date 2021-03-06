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
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;

public class Home extends JFrame{
	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void showHome() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setTitle("OXGAME");

		setResizable(false);
		setMaximumSize(new Dimension(1024, 720));
		setBounds(100, 100, 1011, 706);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				Login login = new Login();
				login.showLogin();
				
			}
		});
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 40));
		btnLogin.setBackground(new Color(205, 133, 63));
		btnLogin.setBounds(529, 317, 304, 66);
		contentPane.add(btnLogin);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				Register register = new Register();
				register.showRegister();
				
			}
		});
		btnRegister.setForeground(Color.WHITE);
		btnRegister.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 40));
		btnRegister.setBackground(new Color(205, 133, 63));
		btnRegister.setBounds(529, 413, 304, 66);
		contentPane.add(btnRegister);

		JLabel homr_background = new JLabel("");
		homr_background.setIcon(new ImageIcon(Home.class.getResource("/photo/backHome.png")));
		homr_background.setBounds(0, 0, 1003, 672);
		contentPane.add(homr_background);
		contentPane.setLayout(null);
	}

}
