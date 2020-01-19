package com.example.asynchronous.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/Menu")
public class Menu {
    @PostMapping("/addItem")
    public ResponseEntity<String> addItemToMenu(){

    }

}
