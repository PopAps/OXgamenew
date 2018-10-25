import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

public class ListFriendPanel extends JPanel {

	/**
	 * Create the panel.
	 */

	JPanel pannel = new JPanel();
	JLabel picture;
	JLabel Username;
	public JButton status;
	
	public ListFriendPanel() {
	
		
		picture = new JLabel();
		picture.setBounds(10, 11, 100, 40);
		pannel.setBackground(Color.WHITE);
		pannel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(119, 136, 153), new Color(119, 136, 153), new Color(119, 136, 153), new Color(119, 136, 153)));
		pannel.add(picture);
		
		Username = new JLabel("New label");
		Username.setFont(new Font("Dialog", Font.BOLD, 26));
		Username.setBounds(139, 11, 100, 40);
		pannel.add(Username);
		
		status = new JButton("Join");
		status.setBackground(new Color(205, 133, 63));
		pannel.add(status);
		

	}
	 JPanel pannelfrined() {
		return pannel;
		 
	}
	 public void setlabel( ImageIcon m) {
		   this.picture.setIcon(m);
		   
	  
	 }
	 public void setlabelUser(String txt) {
		 this.Username.setText(txt);
	 }
	

}
