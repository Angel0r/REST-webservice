package com.angelos.wsjava.mongodb;

import java.net.UnknownHostException;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.util.JSON;

public class mongo {

	@SuppressWarnings("deprecation")
	public static String postId(String id) throws UnknownHostException {

		Mongo mongo = new Mongo("localhost", 27017);
		DB db = mongo.getDB("service");
		DBCollection collection = db.getCollection("logspost");

		String json = id;

		DBObject dbObject = (DBObject) JSON.parse(json);
		collection.insert(dbObject);

		DBCursor cursorDocJSON = collection.find();
		while (cursorDocJSON.hasNext()) {
			System.out.println(cursorDocJSON.next());
		}

		collection.remove(new BasicDBObject());

		return json;
	}

}