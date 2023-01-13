package com.example.demo.controllers;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.RestController;  
@RestController  
public class controller {  
 
    @GetMapping(value = "/")  
    public String getHello(){  
        return "hello";  
    }
    
    @GetMapping(value = "/world")  
    public String getHelloWorl(){  
        return "hello world";  
    }  
}   