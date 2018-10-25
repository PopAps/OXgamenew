import java.util.ArrayList;
import java.util.List;

import org.bson.BasicBSONObject;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

public class UserDao {
	ConnectMongoDB connect;
	DB db;
	DBCollection collection;

	UserDao() {
		connect = new ConnectMongoDB();

	}

	/**** insert User ********************/
	void insertDao(BasicDBObject insertUser) {
		db = connect.getDatabaseName();
		collection = db.getCollection("User");
		collection.insert(insertUser);

	}

	/******** check user register *******/
	boolean getUserRegister(BasicDBObject Query) {
		db = connect.getDatabaseName();
		collection = db.getCollection("User");
		int cursor = collection.find(Query).count();
		if (cursor == 0) {
			return true;
		}
		return false;
	}

	/********* check User login ************/

	boolean getUserLogin(BasicDBObject Query) {
		db = connect.getDatabaseName();
		collection = db.getCollection("User");
		int cursor = collection.find(Query).count();
		if (cursor == 0) {
			return false;
		}
		return true;
	}

	/********* get list friend ***********/
	List<DBObject> getUserAll() {
		db = connect.getDatabaseName();
		collection = db.getCollection("User");
		BasicDBObject sort = new BasicDBObject();
		sort.put("status", -1);
		List<DBObject> cursor = collection.find().sort(sort).toArray();

		return cursor;
	}

	/********* query image of only user **/
	String getImageOfUser(BasicDBObject Query) {
		db = connect.getDatabaseName();
		collection = db.getCollection("User");
		DBCursor cursor = collection.find(Query);
		if (cursor.size() > 0) {
			while (cursor.hasNext()) {

				return cursor.next().get("picture").toString();
			}
		}

		return null;

	}
	void updateUser(BasicDBObject searchQuery,BasicDBObject newDocument) {
		db = connect.getDatabaseName();
		collection = db.getCollection("User");
		collection.update(searchQuery, newDocument);

		
		
	}

}
