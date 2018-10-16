import java.util.ArrayList;
import java.util.List;

import javax.swing.text.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class ConnectMongoDB {
	MongoClientURI uri ;
	MongoClient client;
	DB db;
	DBCollection collecttion;
	public ConnectMongoDB() {
		try {
			uri = new MongoClientURI("mongodb://userox:userox123@ds243212.mlab.com:43212/ox");
			client = new MongoClient(uri);
			System.out.println("Connect Sucessful!! ");
		
		} catch (Exception e) {

		}
		
	}
	public DB getDatabaseName() {
		return db = client.getDB(uri.getDatabase());
		
	}
	public DBCollection getCollection() {
		collecttion = db.getCollection("User"); 
		return collecttion;
	}	
	
}

