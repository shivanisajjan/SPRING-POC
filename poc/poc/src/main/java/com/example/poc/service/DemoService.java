//package com.example.poc.service;
//
//import com.example.poc.model.Custom;
//import com.example.poc.model.Demo;
//import com.example.poc.repository.DemoRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mongodb.core.MongoOperations;
//import org.springframework.data.mongodb.core.query.Update;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
//import static org.springframework.data.mongodb.core.query.Criteria.where;
//import static org.springframework.data.mongodb.core.query.Query.query;
//
//@Service
//public class DemoService {
//    private DemoRepo demoRepo;
//    private MongoOperations mongo;
//
//    @Autowired
//    public DemoService(DemoRepo demoRepo, MongoOperations mongo) {
//        this.demoRepo = demoRepo;
//        this.mongo = mongo;
//    }
//
//    public Demo saveDetails(Demo demo){
//        demoRepo.save(demo);
//        return demo;
//    }
//
//    public List<Demo> getAllDetails(){
//        return demoRepo.findAll();
//    }
//
//    public boolean deleteDetails(int id){
//        demoRepo.deleteById(id);
//        return true;
//    }
//
//    public Demo updateDetails(Demo demo){
//        demoRepo.save(demo);
//        return demo;
//    }
//
//    public int getNextSequence(String seqName)
//    {
//        Custom counter = mongo.findAndModify(
//                query(where("_id").is(seqName)),
//                new Update().inc("seq",1),
//                options().returnNew(true).upsert(true),
//                Custom.class);
//        return counter.getSeq();
//    }
//
//
//}
//
