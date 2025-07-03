package com.example.Springbootfirstproject.controller;

import com.example.Springbootfirstproject.Models.Employee;
import com.example.Springbootfirstproject.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController

public class HelloWorldController {
    @Autowired
    HelloWorldService hws;
    @GetMapping("/emp")
    public List<Employee> emp(){
        return hws.getAllEmployees();
    }
    @PostMapping("/emp")
    public void setvalues(@RequestBody Employee emp){
        hws.setvalues(emp);
    }
    @GetMapping("/hello")
    public String gethello(){
        return hws.gethello();
        //System.out.println("hello world");
        //return "hello world hi hi";
    }
    @PostMapping("/hello")
    public String postHello(){
        return hws.postHello();
    }
    @PutMapping("/hello")
    public String putHello(){
        return hws.putHello();
    }
    @DeleteMapping("/hello")
    public String deleteHello(){
        return hws.deleteHello();
    }
}
