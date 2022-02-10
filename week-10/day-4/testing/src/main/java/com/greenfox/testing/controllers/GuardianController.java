package com.greenfox.testing.controllers;

import com.greenfox.testing.models.ErrorMessage;
import com.greenfox.testing.models.Translator;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class GuardianController {

    @GetMapping("/groot")
    public ResponseEntity<?> translate(@RequestParam(name = "message", required = false) Optional<String> message) {
        if (!message.isPresent() || message.get().isEmpty()) {
            return ResponseEntity.badRequest().body(new ErrorMessage("I am Groot!"));
        } else {
            Translator translator = new Translator(message.get());
            return ResponseEntity.ok(translator);
        }
    }
}
