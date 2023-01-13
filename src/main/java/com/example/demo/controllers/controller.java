package com.example.demo.controllers;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.RestController;  
@RestController  
public class ProductController {  
 
@GetMapping(value = "/")  
public string getProduct()   
{  
    return “hello world”;  
}  

}  
