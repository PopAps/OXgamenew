import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;

public class Login_DB {
	ConnectMongoDB connect;
	DB db;
	DBCollection collection;
	
	Login_DB(){
        connect = new ConnectMongoDB();
    }
	
	public boolean CheckLogin(String username,String password) {
		BasicDBObject Query = new BasicDBObject();
		Query.put("username", username);
		Query.put("password", password);
		db = connect.getDatabaseName();
	    collection = db.getCollection("User");
        boolean  cursor = collection.find(Query).hasNext();
        if(cursor==true) {
        	return true;
        }
        return false;
	}

}
