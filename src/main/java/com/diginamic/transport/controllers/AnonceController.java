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

import com.diginamic.transport.models.Anonce;
import com.diginamic.transport.services.AnonceService;

@RestController
@RequestMapping("/anonce")
@CrossOrigin(origins = "*")
public class AnonceController {
    private final AnonceService anonceService;

    public AnonceController(AnonceService anonceService) {
        this.anonceService = anonceService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Anonce>> getAllAnonces () {
        List<Anonce> anonces = anonceService.findAllAnonces();
        return new ResponseEntity<>(anonces, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Anonce> getAnonceById (@PathVariable("id") Long id) {
        Anonce anonce = anonceService.findAnonceById(id);
        return new ResponseEntity<>(anonce, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Anonce> addAnonce(@RequestBody Anonce anonce) {
        Anonce newAnonce = anonceService.addAnonce(anonce);
        return new ResponseEntity<>(newAnonce, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Anonce> updateAnonce(@RequestBody Anonce anonce) {
        Anonce updateAnonce = anonceService.updateAnonce(anonce);
        return new ResponseEntity<>(updateAnonce, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteAnonce(@PathVariable("id") Long id) {
        anonceService.deleteAnonce(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
