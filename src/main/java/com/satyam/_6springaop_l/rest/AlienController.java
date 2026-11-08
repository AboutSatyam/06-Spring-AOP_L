package com.satyam._6springaop_l.rest;

import com.satyam._6springaop_l.model.Alien;
import com.satyam._6springaop_l.service.IAlienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlienController {
    @Autowired
    private IAlienService service;

    @PostMapping("/add-alien")
    public ResponseEntity<Alien> registerAlien(@RequestBody Alien alien) {
        Alien al = service.registerAlien(alien);
        return new ResponseEntity<Alien>(al, HttpStatus.CREATED);
    }


    @GetMapping("/get-alien")
    public ResponseEntity<List> getAllAlien() {
        List<Alien> aliens = service.getAllAlienInfo();
        return new ResponseEntity<List>(aliens, HttpStatus.OK);
    }


}
