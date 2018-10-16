import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;

public class Register_DB {
	ConnectMongoDB connect;
	DBCollection collecttion;
	DB db;
	
	Register_DB(){
	        connect = new ConnectMongoDB();
	}

	public void input(String nickname,String username ,String password,String StringPath){
        BasicDBObject insertUser= new BasicDBObject();
        insertUser.put("username", username);
        insertUser.put("password", password);
        insertUser.put("picture",StringPath);
        insertUser.put("nickname", nickname);
        db = connect.getDatabaseName();
        collecttion = db.getCollection("User");
        collecttion.insert(insertUser);  
   }
	public int getUserCount(String user) {
        String check=null;
		BasicDBObject Query = new BasicDBObject();
		Query.put("user", user);
		
		db = connect.getDatabaseName();
	    collecttion = db.getCollection("User");
        int  cursor = collecttion.find(Query).count();
        if(cursor==0) {
        	return 0;
        }
        return 1;
		
	}
	
}