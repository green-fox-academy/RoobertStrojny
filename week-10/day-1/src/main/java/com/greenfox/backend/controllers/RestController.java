package com.greenfox.backend.controllers;

import com.greenfox.backend.models.Doubling;
import com.greenfox.backend.models.Greeter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/doubling")
    public ResponseEntity<?> getDouble(@RequestParam(name = "input", required = false) Integer input) {
        if (input == null) {
            Doubling doublingError = new Doubling();
            doublingError.setError("Please provide an input!");
            return ResponseEntity.status(200).body(doublingError);
        } else {
            Doubling doubling = new Doubling(input);
            return ResponseEntity.status(200).body(doubling);
        }
    }

    @GetMapping("/greeter")
    public ResponseEntity<?> getGreet(@RequestParam(name = "name", required = false) String name,
                                      @RequestParam(name = "title", required = false) String title) {
        Greeter greeter = new Greeter(name, title);
        if (name != null && title != null) {
            return ResponseEntity.status(200).body(greeter);
        } else {
            greeter.setErrorBasedOnInputs();
            return ResponseEntity.status(400).body(greeter);
        }
    }
}
