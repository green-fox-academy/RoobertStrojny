package com.greenfox.backend.controllers;

import com.greenfox.backend.models.ErrorMessage;
import com.greenfox.backend.models.sith.SithDto;
import com.greenfox.backend.services.SithServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SithController {

    SithServiceImpl sithService;

    @Autowired
    public SithController(SithServiceImpl sithService) {
        this.sithService = sithService;
    }

    @PostMapping("/sith")
    public ResponseEntity<?> reverserOfTheSith(@RequestBody SithDto sithDto) {
        if (sithDto.getText().isEmpty()) {
            return ResponseEntity.ok(new ErrorMessage("Feed me some text you have to, padawan young you are. Hmmm."));
        }

        return ResponseEntity.ok(sithService.getSithText(sithDto.getText()));
    }
}
