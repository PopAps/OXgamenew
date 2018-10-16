import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FunctionRegister {
	JFrame frame;


	
	public FunctionRegister(String nickname, String username, String password, String re_password,String picture) {
		Register_DB resigter= new Register_DB();
		OX ox = new OX();
		
		  int countuser = resigter.getUserCount(username);
		  if(countuser>0) {
			  JOptionPane.showMessageDialog(frame, "Username incorrect!!");
		  }else {
			  if(password.equals(re_password)) {
				  resigter.input(nickname,username,password,picture); 
				 JOptionPane.showMessageDialog(frame, "Successful!!");
			  }else {
				  JOptionPane.showMessageDialog(frame, "Password incorrect!!");
			  }
			
			 
		  }
	}
	


}
