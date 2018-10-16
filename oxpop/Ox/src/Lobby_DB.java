import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.management.Query;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class Lobby_DB {
	ConnectMongoDB  connect ;
	MongoClient client;
	DB db;
	DBCollection collection;
	public Lobby_DB() {
		 connect = new ConnectMongoDB();
	}
	
	public DBCollection Show_listfriend() {
		db = connect.getDatabaseName();	
		collection = db.getCollection("User");
		return collection;
	}
	public String pictureUsername(String username) {
		db = connect.getDatabaseName();	
		collection = db.getCollection("User");
		List userlist = collection.distinct("username");
		List picturelist = collection.distinct("picture");
		
		if(userlist.size()>0) {
			  for(int i=0;i<userlist.size()&&i<picturelist.size();i++) {
			        if(username.equals(userlist.get(i))) {
			        	return picturelist.get(i).toString();
			        }
              
	           }
		}
		return null;
        
	}

}
