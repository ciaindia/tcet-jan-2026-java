package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
public class HelloController {
    
    // http://localhost:8080/hi
    @GetMapping("/hi")
    public String test() {
        return "Hi from hello controller";
    }
    
    //Create REST API with endpoint /sqr/5 it should print square of 5
    @GetMapping("/sqr/{num}")
    public String getSqr(@PathVariable int num) {
        return "Square of " + num + " is " + (num * num);
    }
    
    //Create REST API with endpoint /sum/5/6 to print addition
    //5 + 6 = 11

    //RUN THIS IN POSTMAN WITH METHOD: POST
    //http://localhost:8080/calc/ 
    /** pass this in body --> raw --> JSON in POSTMAN
     * { "num1": 5, "num2": 6 }
     */ // npm create vite@latest my-react-app
    //CW: /calc PUT method => to print multiplication   
    //CW: /calc DELETE mthod => to print division
    @PostMapping("/calc")
    public String getAdd(@RequestBody Map<String, Integer> body) {
        System.out.println(body.get("num1"));
        System.out.println(body.get("num2"));
        int x = body.get("num1");
        int y = body.get("num2");
        int add = x + y;
        return x + " + " + y + " = " + (add);
    }

}
