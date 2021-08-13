package test.mongo


import com.mongodb.MongoClient
import org.bson.types.ObjectId
import org.jongo.Jongo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.mongo.MongoProperties
import org.springframework.context.annotation.Bean

/**
 * 主要测试一下，在不同的操作下 Mongo 返回的 WriteResult
 */
@SpringBootApplication
class Application implements CommandLineRunner {

    @Autowired
    MongoClient mongo

    @Override
    void run(String... args) {
        third()
    }

    def third() {
        def db = mongo.getDB("cms2")
        def jongo = new Jongo(db)
        def collection = jongo.getCollection("cms_bt_feed_info_c009")

        def id = new ObjectId("57c3da67c0e3eb02a867fac3")
        def obj = collection.findOne(id).as(Map.class)

        obj.put("creater", "CmsSwissWatchAnalysisJob")

        collection.save(obj)
    }

    def second() {
        def db = mongo.getDB("cms2")
        def jongo = new Jongo(db)
        def collection = jongo.getCollection("cms_bt_feed_info_c009")

        def id = new ObjectId("57c3da67c0e3eb02a867fac3")
        def obj = collection.findOne(id).as(Map.class)
        def deleteWriteResult = collection.remove(id)

        println("remove => " + deleteWriteResult.properties.toMapString())

        def insertWriteResult = collection.insert(obj)

        println("insert => " + insertWriteResult.properties.toMapString())
    }

    def first() {
        def db = mongo.getDB("cms2")
        def jongo = new Jongo(db)
        def collection = jongo.getCollection("cms_bt_feed_info_c009")
        def obj = collection.findOne(new ObjectId("57c3da67c0e3eb02a867fac3")).as(Map.class)
//        old value: CmsSwissWatchAnalysisJob
//        ------
//        obj.put("creater", ["a", "b"]);
//        ------
//        List<String> list = obj.get("creater");
//        list.add("1");
//        list.add("2");
//        println(list);
//        ------
//        obj.remove("creater");
//        ------
//        def newObj = ["a": "A", "b": "B"];
//        obj.put("creater", newObj);
//        ------
//        Map child = obj.get("creater");
//        child.put("a", "A1111");
//        ------
//        Map child = obj.get("creater");
//        child.put("a", ["A", "B", "C", "D"]);
//        ------
//        Map child = obj.get("creater");
//        List<String> list = child.get("a");
//        list.add("EEE");
//        ------
//        obj.put("creater1", "aaa")
//        obj.put("creater2", "aaa")
//        ------
        def result = collection.save(obj)
        println(result.properties.toMapString())
    }

    @Bean
    MongoProperties properties() {
        def properties = new MongoProperties()
        properties.uri = "mongodb://10.0.0.59:27017"
        return properties
    }

    static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args)
    }
}
