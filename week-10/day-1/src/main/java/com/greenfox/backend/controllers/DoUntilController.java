package com.greenfox.backend.controllers;

import com.greenfox.backend.models.DoUntil;
import com.greenfox.backend.models.DoUntilDto;
import com.greenfox.backend.models.ErrorMessage;
import com.greenfox.backend.services.DoUntilService;
import com.greenfox.backend.services.DoUntilServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoUntilController {
    DoUntilServiceImpl doUntilService;

    @Autowired
    public DoUntilController(DoUntilServiceImpl doUntilService) {
        this.doUntilService = doUntilService;
    }

    @PostMapping("/dountil/{operation}")
    public ResponseEntity<?> doUntil(@PathVariable() String operation, @RequestBody DoUntilDto untilDto) {
        if (untilDto == null) {
            return ResponseEntity.ok(new ErrorMessage("Please provide a number!"));
        }
        if (operation.equals("sum")) {
            return ResponseEntity.ok(doUntilService.sum(untilDto.getUntil()));
        } else if (operation.equals("factor")){
            return ResponseEntity.ok(doUntilService.factorial(untilDto.getUntil()));
        } else {
            return ResponseEntity.ok(new ErrorMessage("Bad operation"));
        }
    }
}
