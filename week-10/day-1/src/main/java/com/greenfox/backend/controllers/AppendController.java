package com.greenfox.backend.controllers;

import com.greenfox.backend.services.AppendServiceImpl;
import com.greenfox.backend.services.LogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppendController {
    AppendServiceImpl appendService;
    LogServiceImpl logService;

    @Autowired
    public AppendController(AppendServiceImpl appendService, LogServiceImpl logService) {
        this.appendService = appendService;
        this.logService = logService;
    }

    @GetMapping("/appenda/{appendable}")
    public ResponseEntity<?> getAppend(@PathVariable String appendable) {
        logService.saveLog("/appenda/" + appendable, null);
        return ResponseEntity.ok(appendService.appendLetterA(appendable));
    }
}
