package com.diginamic.transport.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.diginamic.transport.models.Boite;
import com.diginamic.transport.services.BoiteService;

@RestController
@RequestMapping("/boite")
@CrossOrigin(origins = "*")
public class BoiteController {
    private final BoiteService boiteService;

    public BoiteController(BoiteService boiteService) {
        this.boiteService = boiteService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Boite>> getAllBoites () {
        List<Boite> boites = boiteService.findAllBoites();
        return new ResponseEntity<>(boites, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Boite> getBoiteById (@PathVariable("id") Long id) {
        Boite boite = boiteService.findBoiteById(id);
        return new ResponseEntity<>(boite, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Boite> addBoite(@RequestBody Boite boite) {
        Boite newBoite = boiteService.addBoite(boite);
        return new ResponseEntity<>(newBoite, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Boite> updateBoite(@RequestBody Boite boite) {
        Boite updateBoite = boiteService.updateBoite(boite);
        return new ResponseEntity<>(updateBoite, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteBoite(@PathVariable("id") Long id) {
        boiteService.deleteBoite(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
