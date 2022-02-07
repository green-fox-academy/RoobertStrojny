package com.greenfox.backend.controllers;

import com.greenfox.backend.models.Doubling;
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
            return new ResponseEntity<>(doublingError, HttpStatus.OK);
        } else {
            Doubling doubling = new Doubling(input);
            return new ResponseEntity<>(doubling, HttpStatus.OK);
        }
    }
}
