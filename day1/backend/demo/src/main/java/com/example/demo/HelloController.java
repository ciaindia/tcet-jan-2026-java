package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class HelloController {

    @GetMapping("/employees")
    public List<Employee> showEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", "IT", 1000));
        employees.add(new Employee(2, "Jane", "HR", 2000));
        return employees;
    }

    // http://localhost:8080/calc
    @GetMapping("/calc")
    public String sayHello() {
        return "I am from calc get mapping";
    }

    @PostMapping("/calc")
    public String calcPost() {
        return "I am from calc post mapping";
    }
}
