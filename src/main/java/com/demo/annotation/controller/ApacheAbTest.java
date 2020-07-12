package com.demo.annotation.controller;

import com.sun.javafx.binding.StringFormatter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApacheAbTest {

    @GetMapping("/hello")
    public boolean hello(){
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        return "hello ab test";
        String.format()
        return true;
    }

}
