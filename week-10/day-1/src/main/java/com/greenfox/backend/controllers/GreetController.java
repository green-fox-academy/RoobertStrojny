package com.greenfox.backend.controllers;

import com.greenfox.backend.models.ErrorMessage;
import com.greenfox.backend.models.Greet;
import com.greenfox.backend.services.GreeterServiceImpl;
import com.greenfox.backend.services.LogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
    GreeterServiceImpl greeterService;
    LogServiceImpl logService;

    @Autowired
    public GreetController(GreeterServiceImpl greeterService, LogServiceImpl logService) {
        this.greeterService = greeterService;
        this.logService = logService;
    }

    @GetMapping("/greeter")
    public ResponseEntity<?> getGreet(@RequestParam(name = "name", required = false) String name,
                                      @RequestParam(name = "title", required = false) String title) {
        if (name != null && title != null) {
            logService.saveLog("/greeter", "name=" + name + "&title=" + title);
            return ResponseEntity.status(200).body(greeterService.greet(name, title));
        }

        if (name == null && title == null) {
            return ResponseEntity.status(400).body(new ErrorMessage("Please provide a name and a title!"));
        } else if (name == null) {
            return ResponseEntity.status(400).body(new ErrorMessage("Please provide a name!"));
        } else {
            return ResponseEntity.status(400).body(new ErrorMessage("Please provide a title!"));
        }
    }
}
