package com.example.Springbootfirstproject.Controller;

import com.example.Springbootfirstproject.Models.Employee;
import com.example.Springbootfirstproject.Models.Student;
import com.example.Springbootfirstproject.Services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloWorldController {

    @Autowired
    private HelloWorldService sws;

    @GetMapping("/hello")
    public String hello() {
        return sws.hello();
    }

    @PostMapping("/hello")
    public String postHello() {
        return sws.postHello();
    }

    @PutMapping("/hello")
    public String putMapping() {
        return sws.PutMapping();
    }

    @DeleteMapping("/hello")
    public String deleteMapping() {
        return sws.Deletemapping();
    }

    @PostMapping("/employees")
    public void setArrayListValues(@RequestBody Employee emp) {
        sws.Setvalues(emp);
    }

    @GetMapping("/employees")
    public ArrayList<Employee> getEmployees() {
        return sws.getEmp();
    }

    @PutMapping("/employees")
    public void changeEmployee(@RequestBody List<Employee> emp) {
        sws.ChnageDetails(emp);
    }

    @DeleteMapping("/employees")
    public void deleteEmployee(@RequestBody Employee emp) {
        sws.DeleteEmployee(emp);
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return sws.getAllStudent();
    }

    @PostMapping("/students")
    public String postStudent(@RequestBody Student student) {
        boolean success = sws.saveStudent(student);
        return success ? "Student saved successfully!" : "Failed to save student.";
    }
}
