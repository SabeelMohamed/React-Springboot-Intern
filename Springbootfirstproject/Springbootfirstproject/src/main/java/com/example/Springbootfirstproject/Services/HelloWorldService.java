package com.example.Springbootfirstproject.Services;

import com.example.Springbootfirstproject.Models.Employee;
import com.example.Springbootfirstproject.Models.Student;
import com.example.Springbootfirstproject.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class HelloWorldService {

    private ArrayList<Employee> l = new ArrayList<>(Arrays.asList(
            new Employee(1, "SUMO", "doctor", "500"),
            new Employee(2, "abc", "def", "")
    ));

    public ArrayList<Employee> getEmp() {
        return l;
    }

    public void Setvalues(Employee emp) {
        l.add(emp);
    }

    public void ChnageDetails(List<Employee> emp) {
        for (int i = 0; i < l.size(); i++) {
            if (emp.size() >= 2 && l.get(i).getEmpid() == emp.get(0).getEmpid()) {
                l.set(i, emp.get(1));
            }
        }
    }

    public void DeleteEmployee(Employee emp) {
        l.remove(emp);
    }

    @Autowired
    private StudentRepo studentRepo;

    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }

    public boolean saveStudent(Student student) {
        try {
            studentRepo.save(student);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String hello() {
        return "hello from GetMapping";
    }

    public String postHello() {
        return "hello from postHello";
    }

    public String PutMapping() {
        return "Hello from PutMapping";
    }

    public String Deletemapping() {
        return "Hello From DeleteMapping";
    }
}
