package com.rubin.test.mongo;

import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.client.*;
import org.bson.Document;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * Created by RubinCarter on 2016/10/24.
 */
public class MongoDBJDBC {

    public static void main(String[] args) {
        try (
                MongoClient mongoClient = new MongoClient("localhost", 27017)
                ){
            MongoDatabase database = mongoClient.getDatabase("test");
            MongoCollection<Document> test = database.getCollection("testcol");
            //test.createIndex(new Document("likes", 1));
            test.aggregate(Collections.singletonList(
                    new Document("$group",  new Document("_id", "$description").append("likesum", new Document("$sum", "$likes")))
            )).forEach(((Block<Document>) document -> {
                document.entrySet().forEach((entry->{
                    System.out.println(String.format("%s---%s", entry.getKey(), entry.getValue()));
                }));
            }));
            /*MongoIterable<Document> documents = test.find(new Document("likes", new Document("$type", "string"))).skip(0).limit(5).sort(new Document("title", 1));
            documents.forEach((Block<Document>)(document)->{
                document.entrySet().forEach((entry)->{
                    System.out.println(String.format("%s---%s", entry.getKey(), entry.getValue()));
                });
                System.out.println();
                if(document.containsKey("likes")) {
                    test.updateMany(new Document("_id", document.get("_id")), new Document("$set", new Document("likes", Integer.parseInt((String) document.get("likes")))));
                }
            });*/
//            test.findOneAndUpdate(new Document("title", "mongo"), new Document("$set", new Document("likes", "200")));
            /*test.insertMany(Arrays.asList(
                    new Document("title", "mongo2")
                    .append("description", "database")
                    .append("likes", "100"),
                    new Document("title", "mongo3")
                    .append("description", "database")
                    .append("likes", "300")
            ));*/
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
