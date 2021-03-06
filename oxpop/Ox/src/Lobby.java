import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;

import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

public class Lobby extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	DBCursor cursor;
	ConnectMongoDB con;
	public JLabel pictureProfile;
	public JLabel usernameProfile;
	public String pathpicture;
	public String username;
    LobbyService lobbyService;
    public static Lobby frame;
	/**
	 * Launch the application.
	 */
	public static void showLobby() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Lobby();
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
	public Lobby() {
		setTitle("OXGAME");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1003, 672);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panellist();

		textField = new JTextField();
		textField.setBounds(562, 66, 337, 23);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println(username);
				lobbyService = new LobbyService();
				lobbyService.Logout(username);
				Home home = new Home();
				
				home.showHome();
				setVisible(false);
				
			
			
			}
		});
		btnLogout.setBounds(823, 570, 89, 23);
		btnLogout.setBackground(new Color(51,153,255));
		contentPane.add(btnLogout);
		JButton btnScored = new JButton("Score");
		btnScored.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});

		btnScored.setBounds(719, 571, 89, 23);
		btnScored.setBackground(new Color(51,153,255));
		contentPane.add(btnScored);

		JButton btnSearch = new JButton("search");
		btnSearch.setBackground(new Color(51,153,255));
		btnSearch.setBounds(899, 66, 78, 23);

		contentPane.add(btnSearch);

		usernameProfile = new JLabel("");
		usernameProfile.setHorizontalAlignment(SwingConstants.CENTER);
		usernameProfile.setForeground(Color.ORANGE);
		usernameProfile.setFont(new Font("Dialog", Font.BOLD, 43));
		usernameProfile.setBounds(146, 284, 229, 71);
		contentPane.add(usernameProfile);

		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 604, 987, 29);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblSoftdevinformatiscbuu = new JLabel("SOFT_DEV @informatiscbuu");
		lblSoftdevinformatiscbuu.setForeground(new Color(255, 255, 255));
		lblSoftdevinformatiscbuu.setHorizontalAlignment(SwingConstants.CENTER);
		lblSoftdevinformatiscbuu.setBounds(338, 11, 258, 14);
		panel.add(lblSoftdevinformatiscbuu);

		JButton btnRank = new JButton("Ranking");
		btnRank.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnRank.setBounds(620, 571, 89, 23);
		btnRank.setBackground(new Color(51,153,255));
		contentPane.add(btnRank);

		JLabel lblUsername = new JLabel("User :");
		lblUsername.setBounds(67, 297, 110, 48);
		lblUsername.setForeground(Color.ORANGE);
		lblUsername.setFont(new Font("Dialog", Font.BOLD, 28));
		contentPane.add(lblUsername);
	
	
		
						pictureProfile = new JLabel("");
						pictureProfile.setBounds(104, 62, 147, 147);
						contentPane.add(pictureProfile);
						
						JLabel labalframe = new JLabel("");
						labalframe.setIcon(new ImageIcon("../Ox/src/photo/frame.png"));
						labalframe.setBounds(2, 11, 334, 263);
						contentPane.add(labalframe);
						
						JLabel bg = new JLabel("");
						bg.setBounds(0, 0, 987, 604);
						bg.setIcon(getNewImage("../Ox/src/photo/bcc.jpg",987, 604));
						contentPane.add(bg);
						
				
	}

	public ImageIcon getNewImage(String path,int w,int h) {
		ImageIcon image = new ImageIcon(path);
		Image images = image.getImage();
		Image newimg = images.getScaledInstance(w,h, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		image = new ImageIcon(newimg);
		return image; 
	}

	public void panellist() {

		JPanel panellist = new JPanel();
		panellist.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panellist.setBounds(562, 100, 415, 410);
		JPanel gui = new JPanel(new BorderLayout(2, 2));
		final JPanel panel = new JPanel(new GridLayout(0, 1));
		panel.setBackground(Color.WHITE);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		final JScrollPane scroll = new JScrollPane(panel);
		scroll.setPreferredSize(new Dimension(415, 410));
		gui.add(scroll, BorderLayout.CENTER);

		String username = "";
		String picture = "";
		int status;
		UserDao userDao = new UserDao();
		List<DBObject> listUser = userDao.getUserAll();
		for (int i = 0; i < listUser.size(); i++) {
			username = (String) listUser.get(i).get("username");
			picture = (String) listUser.get(i).get("picture" + "");
			status =  (int) listUser.get(i).get("status");
			
			
				
				ImageIcon image = new ImageIcon(picture);
				Image images = image.getImage();
				Image newimg = images.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
				image = new ImageIcon(newimg);
				ListFriendPanel listuser = new ListFriendPanel();
                
				if(status==0) {
					listuser.status.setText("Online");
					listuser.status.setBackground(new Color(102,255,102));
				}else if(status==1){
					listuser.status.setText("Playing");
					listuser.status.setBackground(new Color(255,102,0));
			    }else {
			    	listuser.status.setText("Ofline");
					listuser.status.setBackground(new Color(204, 204, 204));
			    }
				
				listuser.setlabel(image);
				listuser.setlabelUser(username + "         ");				
				panel.add(listuser.pannelfrined());
				panel.revalidate();
				int height = (int) panel.getPreferredSize().getHeight();
				scroll.getVerticalScrollBar().setValue(height);


		}

		panellist.add(gui);
		contentPane.add(panellist);
	}
}
