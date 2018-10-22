import java.awt.Component;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FunctionLogin {
	JFrame frame;


	FunctionLogin(String username, String password) {
		Login_DB login = new Login_DB();
		Lobby lobby = new Lobby();
		
		boolean checkLogin = login.CheckLogin(username,password);
		
		if(checkLogin==true) {
			  
			  lobby.usernameProfile.setText(username);
			  Lobby_DB db = new Lobby_DB();
			  String pathpicture = db.pictureUsername(username);
			  ImageIcon image = new ImageIcon(pathpicture);
			  Image images = image.getImage();
			  Image newimg = images.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
			  image = new ImageIcon(newimg);
			  
			  lobby.pictureProfile.setIcon(image);
			  lobby.setVisible(true);
			  
			  
		}else {
			JOptionPane.showMessageDialog(frame, "Username and Password incorrect!!");
		}
	}

}
