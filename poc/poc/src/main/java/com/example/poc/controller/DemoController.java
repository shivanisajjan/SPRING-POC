package com.example.poc.controller;


//import com.example.poc.model.Demo;
//import com.example.poc.service.DemoService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class DemoController {

//    private DemoService demoService;
    private ResponseEntity responseEntity;


//    @Autowired
//    public DemoController(DemoService demoService) {
//        this.demoService = demoService;
//    }

//    @PostMapping(value = "/demo")
//    public ResponseEntity<Demo> saveBook(@RequestBody Demo demo)  {
//        demo.setId(demoService.getNextSequence("customSequences"));
//        return new ResponseEntity<> (demoService.saveDetails(demo), HttpStatus.CREATED);
//    }
//
//    @DeleteMapping(value = "/delete/{id}")
//    public ResponseEntity<Boolean> delete(@PathVariable int id){
//        return new ResponseEntity<>(demoService.deleteDetails(id), HttpStatus.OK);
//    }
//    @PutMapping(value = "/update")
//    public ResponseEntity<Demo> update(@RequestBody Demo demo) {
//        demoService.updateDetails(demo);
//        return new ResponseEntity<>(demo, HttpStatus.OK);
//    }
//    @GetMapping(value = "/allDetails")
//    public ResponseEntity<List<Demo>> getAllDetails()
//    {
//        return new ResponseEntity<>(demoService.getAllDetails(),HttpStatus.OK);
//    }

    @GetMapping(value = "/response")
    public String helloWorld()
    {
        return "HelloWorld";
    }

}
