package com.restapi.restapireact.controllers;

import com.restapi.restapireact.entities.Item;
import com.restapi.restapireact.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value = "/")
public class MainController {
    @Autowired
    private ItemService itemService;

    @GetMapping(value = "/allitems")
    public ResponseEntity<?> getAllItems() {
        List<Item> items = itemService.getAll();
        return new ResponseEntity<>(items, HttpStatus.OK);
    }
}