package com.greenfox.backend.controllers;

import com.greenfox.backend.models.Append;
import com.greenfox.backend.services.AppendServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppendController {
    AppendServiceImpl appendService;

    @Autowired
    public AppendController(AppendServiceImpl appendService) {
        this.appendService = appendService;
    }

    @GetMapping("/appenda/{appendable}")
    public ResponseEntity<?> getAppend(@PathVariable String appendable) {
        return ResponseEntity.ok(appendService.appendLetterA(appendable));
    }
}
