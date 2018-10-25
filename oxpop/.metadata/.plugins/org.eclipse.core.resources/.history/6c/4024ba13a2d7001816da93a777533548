import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home {

	JFrame frame;

	/* panel */
	JPanel home = new JPanel();
	JPanel register = new JPanel();
	JPanel login = new JPanel();
	JPanel rank = new JPanel();
	JPanel wait = new JPanel();
	JPanel invite = new JPanel();

	/* JTextField */
	private JTextField registerNickname;
	private JTextField registerRepassword;
	private JTextField registerPassword;
	private JTextField registerUsername;
	private JTextField loginUsername;
	private JPasswordField loginPassword;

	/* Selectpic */
	private JPanel selectPic = new JPanel();
	JLabel btnpic1 = new JLabel("1");
	JLabel btnpic2 = new JLabel("2");
	JLabel btnpic3 = new JLabel("10");
	JLabel btnpic6 = new JLabel("6");
	JLabel btnpic4 = new JLabel("4");
	JLabel btnpic7 = new JLabel("7");
	JLabel btnpic8 = new JLabel("8");
	JLabel btnpic9 = new JLabel("9");
	JLabel btnpic5 = new JLabel("5");
	public String register_idPic = "";
	public String pathPhoto = "";
	JLabel registerPhoto = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
					window.frame.setVisible(true);
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
		initialize();

		login.setVisible(false);
		home.setVisible(true);
		register.setVisible(false);
		rank.setVisible(false);
		wait.setVisible(false);
		invite.setVisible(false);

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setMaximumSize(new Dimension(1024, 720));
		frame.setBounds(100, 100, 1011, 706);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		login.setBounds(0, 0, 1003, 672);
		frame.getContentPane().add(login);
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
		login.add(loginUsername);
		loginUsername.setColumns(10);
		LoginService logins = new LoginService();
		JButton button_Login = new JButton("LOGIN");
		button_Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {


				if (logins.checkLogin(loginUsername.getText(), new String(loginPassword.getPassword())) == true) {
					
					logins.setLobby(loginUsername.getText());
					frame.setVisible(false);
				} else {
					JOptionPane.showMessageDialog(frame, "Username and Password incorrect!!");
				}	

			}
		});
		button_Login.setForeground(Color.WHITE);
		button_Login.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 40));
		button_Login.setBackground(new Color(205, 133, 63));
		button_Login.setBounds(567, 444, 232, 66);
		login.add(button_Login);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				login.setVisible(false);
				home.setVisible(true);
				register.setVisible(false);
				rank.setVisible(false);
				wait.setVisible(false);
				invite.setVisible(false);
			}
		});

		loginPassword = new JPasswordField();
		// login_password.setText("PASSWORD");
		loginPassword.setFont(new Font("Tahoma", Font.PLAIN, 30));
		loginPassword.setBackground(new Color(255, 255, 224));
		loginPassword.setForeground(new Color(205, 133, 63));
		loginPassword.setBounds(670, 372, 244, 54);
		login.add(loginPassword);

		JLabel lblNewLabel_10 = new JLabel("USERNAME");
		lblNewLabel_10.setForeground(new Color(153, 102, 51));
		lblNewLabel_10.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 30));
		lblNewLabel_10.setBounds(420, 316, 238, 38);
		login.add(lblNewLabel_10);
		lblNewLabel_2.setIcon(new ImageIcon(Home.class.getResource("/photo/home.png")));
		lblNewLabel_2.setBounds(12, 13, 60, 55);
		login.add(lblNewLabel_2);

		JLabel lblPassword_1 = new JLabel("PASSWORD");
		lblPassword_1.setForeground(new Color(153, 102, 51));
		lblPassword_1.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 30));
		lblPassword_1.setBounds(420, 380, 238, 38);
		login.add(lblPassword_1);

		JLabel login_background = new JLabel("");
		login_background.setIcon(new ImageIcon(Home.class.getResource("/photo/backHome.png")));
		login_background.setBounds(0, 0, 1003, 672);
		login.add(login_background);
		login.setLayout(null);
		register.setBackground(new Color(189, 183, 107));
		register.setBounds(0, 0, 1015, 685);
		frame.getContentPane().add(register);
		register.setLayout(null);

		selectPic.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(0, 0, 0), new Color(0, 0, 0),
				new Color(0, 0, 0), new Color(0, 0, 0)));
		selectPic.setBackground(new Color(255, 230, 204));
		selectPic.setVisible(false);

		selectPic.setBounds(292, 67, 689, 322);
		register.add(selectPic);
		selectPic.setLayout(null);

		btnpic1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				register_idPic = "/picplayer/1.png";

				btnpic1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0),
						new Color(0, 0, 0), new Color(0, 0, 0)));
				btnpic2.setBorder(null);
				btnpic3.setBorder(null);
				btnpic4.setBorder(null);
				btnpic5.setBorder(null);
				btnpic6.setBorder(null);
				btnpic7.setBorder(null);
				btnpic8.setBorder(null);
				btnpic9.setBorder(null);
			}
		});
		btnpic1.setIcon(new ImageIcon(Home.class.getResource("/picplayer/1.png")));
		btnpic1.setBackground(new Color(0, 0, 0));
		btnpic1.setBounds(10, 11, 115, 123);
		selectPic.add(btnpic1);

		JButton SelectPhoto = new JButton("Select");
		SelectPhoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pathPhoto = "../OX/src" + register_idPic;
			}
		});
		SelectPhoto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println(register_idPic);
				selectPic.setVisible(false);
				registerNickname.setVisible(true);
				registerUsername.setVisible(true);
				registerPassword.setVisible(true);
				registerRepassword.setVisible(true);
				registerPhoto.setIcon(new ImageIcon(Home.class.getResource(register_idPic)));
			}
		});
		SelectPhoto.setBackground(new Color(153, 102, 51));
		SelectPhoto.setForeground(new Color(255, 255, 255));
		SelectPhoto.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 18));
		SelectPhoto.setBounds(564, 216, 108, 31);
		selectPic.add(SelectPhoto);
		btnpic2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				register_idPic = "/picplayer/2.png";

				btnpic2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0),
						new Color(0, 0, 0), new Color(0, 0, 0)));
				btnpic1.setBorder(null);
				btnpic3.setBorder(null);
				btnpic4.setBorder(null);
				btnpic5.setBorder(null);
				btnpic6.setBorder(null);
				btnpic7.setBorder(null);
				btnpic8.setBorder(null);
				btnpic9.setBorder(null);
			}
		});

		btnpic2.setIcon(new ImageIcon(Home.class.getResource("/picplayer/2.png")));
		btnpic2.setBounds(147, 11, 115, 123);
		selectPic.add(btnpic2);
		btnpic3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				register_idPic = "/picplayer/10.png";
				btnpic3.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0),
						new Color(0, 0, 0), new Color(0, 0, 0)));
				btnpic2.setBorder(null);
				btnpic1.setBorder(null);
				btnpic4.setBorder(null);
				btnpic5.setBorder(null);
				btnpic6.setBorder(null);
				btnpic7.setBorder(null);
				btnpic8.setBorder(null);
				btnpic9.setBorder(null);
			}
		});

		btnpic3.setIcon(new ImageIcon(Home.class.getResource("/picplayer/10.png")));
		btnpic3.setBounds(282, 11, 115, 123);
		selectPic.add(btnpic3);
		btnpic6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				register_idPic = "/picplayer/6.png";
				btnpic6.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0),
						new Color(0, 0, 0), new Color(0, 0, 0)));
				btnpic2.setBorder(null);
				btnpic3.setBorder(null);
				btnpic4.setBorder(null);
				btnpic1.setBorder(null);
				btnpic5.setBorder(null);
				btnpic7.setBorder(null);
				btnpic8.setBorder(null);
				btnpic9.setBorder(null);
			}
		});

		btnpic6.setIcon(new ImageIcon(Home.class.getResource("/picplayer/6.png")));
		btnpic6.setBounds(10, 173, 115, 123);
		selectPic.add(btnpic6);
		btnpic4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				register_idPic = "/picplayer/4.png";
				btnpic4.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0),
						new Color(0, 0, 0), new Color(0, 0, 0)));
				btnpic2.setBorder(null);
				btnpic3.setBorder(null);
				btnpic1.setBorder(null);
				btnpic5.setBorder(null);
				btnpic6.setBorder(null);
				btnpic7.setBorder(null);
				btnpic8.setBorder(null);
				btnpic9.setBorder(null);
			}
		});

		btnpic4.setIcon(new ImageIcon(Home.class.getResource("/picplayer/4.png")));
		btnpic4.setBounds(419, 11, 115, 123);
		selectPic.add(btnpic4);
		btnpic7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				register_idPic = "/picplayer/7.png";
				btnpic7.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0),
						new Color(0, 0, 0), new Color(0, 0, 0)));
				btnpic2.setBorder(null);
				btnpic3.setBorder(null);
				btnpic4.setBorder(null);
				btnpic1.setBorder(null);
				btnpic6.setBorder(null);
				btnpic5.setBorder(null);
				btnpic8.setBorder(null);
				btnpic9.setBorder(null);
			}
		});

		btnpic7.setIcon(new ImageIcon(Home.class.getResource("/picplayer/7.png")));
		btnpic7.setBounds(147, 173, 115, 123);
		selectPic.add(btnpic7);
		btnpic8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				register_idPic = "/picplayer/8.png";
				btnpic8.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0),
						new Color(0, 0, 0), new Color(0, 0, 0)));
				btnpic2.setBorder(null);
				btnpic3.setBorder(null);
				btnpic4.setBorder(null);
				btnpic1.setBorder(null);
				btnpic6.setBorder(null);
				btnpic7.setBorder(null);
				btnpic5.setBorder(null);
				btnpic9.setBorder(null);
			}
		});

		btnpic8.setIcon(new ImageIcon(Home.class.getResource("/picplayer/8.png")));
		btnpic8.setBounds(282, 173, 115, 123);
		selectPic.add(btnpic8);
		btnpic9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				register_idPic = "/picplayer/9.png";
				btnpic9.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0),
						new Color(0, 0, 0), new Color(0, 0, 0)));
				btnpic2.setBorder(null);
				btnpic3.setBorder(null);
				btnpic4.setBorder(null);
				btnpic1.setBorder(null);
				btnpic6.setBorder(null);
				btnpic7.setBorder(null);
				btnpic8.setBorder(null);
				btnpic5.setBorder(null);
			}
		});

		btnpic9.setIcon(new ImageIcon(Home.class.getResource("/picplayer/9.png")));
		btnpic9.setBounds(419, 173, 115, 123);
		selectPic.add(btnpic9);
		btnpic5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				register_idPic = "/picplayer/5.png";
				btnpic5.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0),
						new Color(0, 0, 0), new Color(0, 0, 0)));
				btnpic2.setBorder(null);
				btnpic3.setBorder(null);
				btnpic4.setBorder(null);
				btnpic1.setBorder(null);
				btnpic6.setBorder(null);
				btnpic7.setBorder(null);
				btnpic8.setBorder(null);
				btnpic9.setBorder(null);
			}
		});

		btnpic5.setIcon(new ImageIcon(Home.class.getResource("/picplayer/5.png")));
		btnpic5.setBounds(564, 11, 115, 123);
		selectPic.add(btnpic5);

		JLabel lblNewLabel_1 = new JLabel("REGISTER");
		lblNewLabel_1.setForeground(new Color(139, 69, 19));
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
		lblNewLabel_1.setBounds(573, 91, 238, 68);
		register.add(lblNewLabel_1);

		JLabel lblNickname = new JLabel("Nickname  ");
		lblNickname.setForeground(new Color(205, 133, 63));
		lblNickname.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		lblNickname.setBounds(446, 156, 183, 61);
		register.add(lblNickname);

		JLabel lblUsername = new JLabel("Username       ");
		lblUsername.setForeground(new Color(205, 133, 63));
		lblUsername.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		lblUsername.setBounds(446, 210, 244, 61);
		register.add(lblUsername);

		JLabel lblPassword = new JLabel("Password  ");
		lblPassword.setForeground(new Color(205, 133, 63));
		lblPassword.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		lblPassword.setBounds(446, 264, 223, 61);
		register.add(lblPassword);

		JLabel lblRepassword = new JLabel("Re-password ");
		lblRepassword.setForeground(new Color(205, 133, 63));
		lblRepassword.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		lblRepassword.setBounds(446, 318, 244, 61);
		register.add(lblRepassword);

		registerNickname = new JTextField();
		registerNickname.setFont(new Font("Angsana New", Font.BOLD, 30));
		registerNickname.setForeground(new Color(205, 133, 63));
		registerNickname.setBounds(681, 172, 244, 41);
		register.add(registerNickname);
		registerNickname.setColumns(10);

		registerRepassword = new JTextField();
		registerRepassword.setFont(new Font("Angsana New", Font.BOLD, 30));
		registerRepassword.setForeground(new Color(205, 133, 63));
		registerRepassword.setColumns(10);
		registerRepassword.setBounds(681, 334, 244, 41);
		register.add(registerRepassword);

		registerPassword = new JTextField();
		registerPassword.setFont(new Font("Angsana New", Font.BOLD, 30));
		registerPassword.setForeground(new Color(205, 133, 63));
		registerPassword.setColumns(10);
		registerPassword.setBounds(681, 280, 244, 41);
		register.add(registerPassword);

		registerUsername = new JTextField();
		registerUsername.setFont(new Font("Angsana New", Font.BOLD, 30));
		registerUsername.setForeground(new Color(205, 133, 63));
		registerUsername.setColumns(10);
		registerUsername.setBounds(681, 226, 244, 41);
		register.add(registerUsername);

		registerPhoto.setIcon(new ImageIcon(Home.class.getResource("/photo/profile.png")));
		registerPhoto.setBackground(new Color(210, 180, 140));
		registerPhoto.setBounds(535, 392, 140, 94);
		register.add(registerPhoto);

		JButton btnSelectpic = new JButton("Select photo");
		btnSelectpic.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				selectPic.setVisible(true);
				if (selectPic.isVisible()) {
					registerNickname.setVisible(false);
					registerUsername.setVisible(false);
					registerPassword.setVisible(false);
					registerRepassword.setVisible(false);
				} else {
					btnSelectpic.setVisible(true);
				}
			}
		});
		btnSelectpic.setBorderPainted(false);
		btnSelectpic.setBackground(new Color(238, 232, 170));
		btnSelectpic.setForeground(new Color(255, 255, 255));
		btnSelectpic.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		btnSelectpic.setBounds(712, 421, 140, 34);
		register.add(btnSelectpic);

		JButton Button_register = new JButton("REGISTER");
		Button_register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RegisterService register = new RegisterService(registerNickname.getText(), registerUsername.getText(),
						registerPassword.getText(), registerRepassword.getText(), pathPhoto);

			}
		});
		Button_register.setBackground(new Color(205, 133, 63));
		Button_register.setForeground(new Color(255, 255, 255));
		Button_register.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
		Button_register.setBounds(598, 510, 192, 54);
		register.add(Button_register);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				home.setVisible(true);
				register.setVisible(false);
				login.setVisible(false);
				rank.setVisible(false);
				wait.setVisible(false);
				invite.setVisible(false);
			}
		});
		lblNewLabel.setIcon(new ImageIcon(Home.class.getResource("/photo/home.png")));
		lblNewLabel.setBounds(26, 24, 61, 54);
		register.add(lblNewLabel);

		JLabel register_Background = new JLabel("New label");
		register_Background.setIcon(new ImageIcon(Home.class.getResource("/photo/backRegister.png")));
		register_Background.setBounds(0, 0, 1003, 672);
		register.add(register_Background);

		frame.getContentPane().add(home);
		home.setBounds(0, 0, 1003, 672);
		rank.setBounds(0, 0, 1003, 672);
		frame.getContentPane().add(rank);

		JLabel lblNewLabel_3 = new JLabel("USERNAME");
		lblNewLabel_3.setForeground(new Color(218, 165, 32));
		lblNewLabel_3.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 29));
		lblNewLabel_3.setBounds(540, 215, 224, 70);
		rank.add(lblNewLabel_3);

		JLabel label = new JLabel("20000");
		label.setForeground(new Color(218, 165, 32));
		label.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 29));
		label.setBounds(776, 221, 163, 58);
		rank.add(label);

		JLabel label_1 = new JLabel("USERNAME");
		label_1.setForeground(new Color(205, 133, 63));
		label_1.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 25));
		label_1.setBounds(540, 304, 224, 58);
		rank.add(label_1);

		JLabel label_2 = new JLabel("2000");
		label_2.setForeground(new Color(205, 133, 63));
		label_2.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 25));
		label_2.setBounds(776, 304, 163, 58);
		rank.add(label_2);

		JLabel label_3 = new JLabel("USERNAME");
		label_3.setForeground(new Color(205, 133, 63));
		label_3.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 25));
		label_3.setBounds(540, 375, 224, 58);
		rank.add(label_3);

		JLabel label_4 = new JLabel("2000");
		label_4.setForeground(new Color(205, 133, 63));
		label_4.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 25));
		label_4.setBounds(776, 375, 163, 58);
		rank.add(label_4);

		JLabel label_5 = new JLabel("USERNAME");
		label_5.setForeground(new Color(205, 133, 63));
		label_5.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 25));
		label_5.setBounds(540, 446, 224, 58);
		rank.add(label_5);

		JLabel label_6 = new JLabel("2000");
		label_6.setForeground(new Color(205, 133, 63));
		label_6.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 25));
		label_6.setBounds(776, 446, 163, 58);
		rank.add(label_6);

		JLabel label_7 = new JLabel("USERNAME");
		label_7.setForeground(new Color(205, 133, 63));
		label_7.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 25));
		label_7.setBounds(540, 524, 224, 58);
		rank.add(label_7);

		JLabel label_8 = new JLabel("2000");
		label_8.setForeground(new Color(205, 133, 63));
		label_8.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 25));
		label_8.setBounds(776, 524, 163, 58);
		rank.add(label_8);

		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}
		});
		lblNewLabel_4.setIcon(new ImageIcon(Home.class.getResource("/photo/lobby.png")));
		lblNewLabel_4.setBounds(12, 13, 56, 58);
		rank.add(lblNewLabel_4);

		JLabel rank_background = new JLabel("");
		rank_background.setIcon(new ImageIcon(Home.class.getResource("/photo/backRank.png")));
		rank_background.setBounds(0, 0, 1003, 672);
		rank.add(rank_background);
		rank.setLayout(null);

		JButton button = new JButton("REGISTER");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				register.setVisible(true);
				home.setVisible(false);
				login.setVisible(false);
				rank.setVisible(false);
				wait.setVisible(false);
				invite.setVisible(false);
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 40));
		button.setBackground(new Color(205, 133, 63));
		button.setBounds(529, 401, 304, 66);
		home.add(button);

		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				home.setVisible(false);
				login.setVisible(true);
				register.setVisible(false);
				rank.setVisible(false);
				wait.setVisible(false);
				invite.setVisible(false);
				loginUsername.setText("  Username");

			}
		});
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 40));
		btnLogin.setBackground(new Color(205, 133, 63));
		btnLogin.setBounds(529, 316, 304, 66);
		home.add(btnLogin);

		JLabel homr_background = new JLabel("");
		homr_background.setIcon(new ImageIcon(Home.class.getResource("/photo/backHome.png")));
		homr_background.setBounds(0, 0, 1003, 672);
		home.add(homr_background);
		home.setLayout(null);

		wait.setBackground(Color.WHITE);
		wait.setBounds(0, 0, 1003, 672);
		frame.getContentPane().add(wait);
		wait.setLayout(null);

		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Home.class.getResource("/photo/wait.gif")));
		lblNewLabel_5.setBounds(321, 48, 484, 599);
		wait.add(lblNewLabel_5);

		invite.setBounds(0, 0, 1003, 672);
		frame.getContentPane().add(invite);
		invite.setLayout(null);

		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7
				.setIcon(new ImageIcon(Home.class.getResource("/photo/ChubbyInfiniteFlyingfox-size_restricted.gif")));
		lblNewLabel_7.setBounds(25, 100, 290, 450);
		invite.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("USERNAME");
		lblNewLabel_8.setForeground(new Color(160, 82, 45));
		lblNewLabel_8.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 25));
		lblNewLabel_8.setBounds(392, 113, 194, 61);
		invite.add(lblNewLabel_8);

		JLabel lblSent = new JLabel("sent you an inviteation.");
		lblSent.setForeground(new Color(0, 0, 0));
		lblSent.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 25));
		lblSent.setBounds(428, 162, 404, 70);
		invite.add(lblSent);

		JLabel lblWillYouAccept = new JLabel("Will you accept?");
		lblWillYouAccept.setForeground(Color.BLACK);
		lblWillYouAccept.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 25));
		lblWillYouAccept.setBounds(428, 211, 404, 70);
		invite.add(lblWillYouAccept);

		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(Home.class.getResource("/photo/correct.png")));
		lblNewLabel_9.setBounds(570, 280, 79, 70);
		invite.add(lblNewLabel_9);

		JLabel label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon(Home.class.getResource("/photo/incorect.png")));
		label_9.setBounds(661, 280, 79, 70);
		invite.add(label_9);

		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBackground(Color.WHITE);
		lblNewLabel_6.setIcon(new ImageIcon(Home.class.getResource("/photo/backInvite.png")));
		lblNewLabel_6.setBounds(0, 0, 1003, 672);
		invite.add(lblNewLabel_6);

		/* register */
	}

}
