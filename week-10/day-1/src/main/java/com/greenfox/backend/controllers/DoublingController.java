package com.greenfox.backend.controllers;

import com.greenfox.backend.models.Doubling;
import com.greenfox.backend.models.ErrorMessage;
import com.greenfox.backend.services.DoublingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoublingController {
    DoublingServiceImpl doublingService;

    @Autowired
    public DoublingController(DoublingServiceImpl doublingService) {
        this.doublingService = doublingService;
    }

    @GetMapping("/doubling")
    public ResponseEntity<?> getDouble(@RequestParam(name = "input", required = false) Integer input) {
        if (input != null) {
            return ResponseEntity.status(200).body(new Doubling(input));
        } else {
            return ResponseEntity.status(200).body(new ErrorMessage("Please provide an input!"));
        }
    }
}
