package controller;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.ServerAddress;

import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;

import org.bson.Document;
import java.util.Arrays;
import com.mongodb.Block;

import com.mongodb.client.MongoCursor;
import static com.mongodb.client.model.Filters.*;
import com.mongodb.client.result.DeleteResult;
import static com.mongodb.client.model.Updates.*;
import com.mongodb.client.result.UpdateResult;
import java.util.ArrayList;
import java.util.List;

public class MongoDBController {
	MongoClient mongoClient;
	MongoDatabase db;
	MongoCollection<Document> tweetsCollection;

	public MongoDBController(){
		mongoClient = new MongoClient("localhost",27017);
		db = mongoClient.getDatabase("politweets");
		tweetsCollection = db.getCollection("tweets");
	}

	public void saveTweet(){

	}

}
