package Collector;

import com.mongodb.MongoClient;

import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;

import org.bson.Document;

import com.google.gson.Gson;
import twitter4j.Status;

public class MongoDBController {
	MongoClient mongoClient;
	MongoDatabase db;
	MongoCollection<Document> tweetsCollection;

	public MongoDBController(){
		mongoClient = new MongoClient("localhost",27017);
		db = mongoClient.getDatabase("politweets");
		tweetsCollection = db.getCollection("tweets");
	}

	public void saveDocument(Status){

	}

}
