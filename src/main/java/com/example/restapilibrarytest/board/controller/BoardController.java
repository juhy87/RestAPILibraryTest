package com.example.restapilibrarytest.board.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {

    @GetMapping("/hello")
    public Object HelloWorld(){
        return ResponseEntity.ok("Hello World");
    }
}
