package com.ibit.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/tick")
public class TickController {

    @GetMapping("/health")
    public ResponseEntity<String> health() {
        return new ResponseEntity<>("healthy", HttpStatus.OK);
    }
}
