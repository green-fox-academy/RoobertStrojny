//package com.greenfoxacademy.springstart.controllers;
//
//import com.greenfoxacademy.springstart.Greeting;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.concurrent.atomic.AtomicLong;
//
//@RestController
//public class HelloRESTController {
//
//    Greeting greeting = new Greeting();
//
//    @RequestMapping(value = "greeting")
//    public Greeting greet(@RequestParam(name = "name") String content) {
//        greeting.setContent(content);
//        greeting.count();
//        return greeting;
//    }
//
//
//}
