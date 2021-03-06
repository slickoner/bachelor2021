package com.krauss.application.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

    @GetMapping("/version")
    public ResponseEntity<String> getVersion() {
        return new ResponseEntity<>("1.0", HttpStatus.OK);
    }
}
