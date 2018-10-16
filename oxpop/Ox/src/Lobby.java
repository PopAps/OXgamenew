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
	public String  pathpicture; 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lobby frame = new Lobby();
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
		contentPane.setBackground(new Color(184, 134, 11));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

	    panellist();

		textField = new JTextField();
		textField.setBounds(562, 66, 337, 23);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(823, 570, 89, 23);
		btnLogout.setBackground(new Color(205, 133, 63));
		contentPane.add(btnLogout);
		JButton btnScored = new JButton("Score");
		btnScored.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                   
			}
		});

		btnScored.setBounds(823, 536, 89, 23);
		btnScored.setBackground(new Color(205, 133, 63));
		contentPane.add(btnScored);
		
		JButton btnSearch = new JButton("search");
		btnSearch.setBackground(new Color(205, 133, 63));
		btnSearch.setBounds(899, 66, 78, 23);
		
		contentPane.add(btnSearch);
		
		pictureProfile = new JLabel("");
		pictureProfile.setBounds(106, 66, 200, 200);

		contentPane.add(pictureProfile);
		
		usernameProfile = new JLabel("");
		usernameProfile.setHorizontalAlignment(SwingConstants.CENTER);
		usernameProfile.setForeground(Color.DARK_GRAY);
		usernameProfile.setFont(new Font("Dialog", Font.BOLD, 43));
		usernameProfile.setBounds(143, 260, 229, 71);
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
		btnRank.setBounds(670, 536, 89, 23);
		btnRank.setBackground(new Color(205, 133, 63));
		contentPane.add(btnRank);
		
		JLabel lblUsername = new JLabel("NAME:");
		lblUsername.setBounds(68, 277, 110, 48);
		lblUsername.setForeground(Color.DARK_GRAY);
		lblUsername.setFont(new Font("Dialog", Font.BOLD, 28));
		contentPane.add(lblUsername);
	
		
		

	}

	@SuppressWarnings("unused")
	private Image getScaledImage(Image srcImg, int w, int h) {
		BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2 = resizedImg.createGraphics();
		g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g2.drawImage(srcImg, 0, 0, w, h, null);
		g2.dispose();

		return resizedImg;
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
		Lobby_DB connect = new Lobby_DB();
		
		String username = "";
		String picture = "";
		
		DBCollection collection = connect.Show_listfriend();
		List userlist = collection.distinct("username");
		List picturelist = collection.distinct("picture");
		
		for(int i=0;i<userlist.size()&&i<picturelist.size();i++) {
			
            username = (String) userlist.get(i);
            picture = (String) picturelist.get(i);
             
		    ImageIcon image = new ImageIcon(picture);
			Image images = image.getImage();
			Image newimg = images.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
			image = new ImageIcon(newimg);
			Listfriend listuser = new Listfriend();

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