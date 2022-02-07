package com.greenfox.backend.controllers;

import com.greenfox.backend.models.ArrayDto;
import com.greenfox.backend.models.ErrorMessage;
import com.greenfox.backend.services.ArrayServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArrayHandlerController {
    ArrayServiceImpl arrayService;

    @Autowired
    public ArrayHandlerController(ArrayServiceImpl arrayService) {
        this.arrayService = arrayService;
    }

    @PostMapping("/arrays")
    public ResponseEntity<?> getResultFromArray(@RequestBody ArrayDto input) {
        if (input.getNumbers() == null || input.getWhat() == null) {
            return ResponseEntity.ok(new ErrorMessage("Please provide what to do with the numbers!"));
        }

        switch (input.getWhat()) {
            case "sum":
                return ResponseEntity.ok(arrayService.sumNumbers(input.getNumbers()));
            case "multiply":
                return ResponseEntity.ok(arrayService.multiplyNumbers(input.getNumbers()));
            case "double":
                return ResponseEntity.ok(arrayService.doubleNumbers(input.getNumbers()));
            default:
                return ResponseEntity.ok(new ErrorMessage("bad input"));
        }
    }
}
