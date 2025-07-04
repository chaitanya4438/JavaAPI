package com.example.JavaAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @GetMapping("/api/welcome")
    public String WelcomeBank(){
        System.out.println("Welcome to ICICI Bank");
        return "Welcome to HDFC Bank";
    }
    @GetMapping("/api/myData")
    public String MylcomeBank(@RequestParam("name")String name){
        System.out.println("Welcome to HDFC Bank");
        System.out.println("Name: "+name);
        return "Welcome to HDFC Bank"+" "+name;
    }
    @PostMapping("/balance")
    public String balance(@RequestParam("name")String name, Object request){
        System.out.println("Welcome to ICICI Bank");
        System.out.println("Request: "+request);
        String balance ="45500";

        return null;
    }

}
