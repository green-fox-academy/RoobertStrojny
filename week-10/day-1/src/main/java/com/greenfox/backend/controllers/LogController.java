package com.greenfox.backend.controllers;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.greenfox.backend.services.LogServiceImpl;
import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
    LogServiceImpl logService;

    @Autowired
    public LogController(LogServiceImpl logService) {
        this.logService = logService;
    }

    @GetMapping("/log")
    public ResponseEntity<?> getLogs() {
        return ResponseEntity.ok(logService.getAllLogs());
    }
}
