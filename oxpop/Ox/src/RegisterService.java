import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.mongodb.BasicDBObject;

public class RegisterService {
	JFrame frame;

   UserDao userDao ;
	
	public RegisterService(String nickname, String username, String password, String re_password,String picture) {
	
		if(password.length()>=6) {
			 if(checkUserName(username)==false) {
				  JOptionPane.showMessageDialog(null, "Username incorrect!!");
			  }else {
				  if(password.equals(re_password)) {
					      input(nickname,username,password,picture); 
					 JOptionPane.showMessageDialog(null, "Successful!!");
				  }else {
					  JOptionPane.showMessageDialog(null, "Password incorrect!!");
				  }
				
			  }
		}else {
			JOptionPane.showMessageDialog(null, "Password is greater than 6 characters");
		}
		
		 
	}
	 void input(String nickname,String username ,String password,String StringPath){
        BasicDBObject insertUser= new BasicDBObject();
        insertUser.put("username", username);
        insertUser.put("password", password);
        insertUser.put("picture",StringPath);
        insertUser.put("nickname", nickname);
        insertUser.put("status", 0);
        
        userDao = new UserDao();
        userDao.insertDao(insertUser);
        
	} 
	boolean checkUserName(String username) {
		userDao = new UserDao();
	    BasicDBObject Query= new BasicDBObject();
	    Query.put("username", username);
		return userDao.getUserRegister(Query);
		
	}

	


}
