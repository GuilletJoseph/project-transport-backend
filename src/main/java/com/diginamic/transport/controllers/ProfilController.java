package com.diginamic.transport.controllers;

import java.util.List;

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
import org.springframework.web.bind.annotation.RestController;

import com.diginamic.transport.models.Profil;
import com.diginamic.transport.services.ProfilService;

@RestController
@RequestMapping("/profil")
@CrossOrigin(origins = "*")
public class ProfilController {
    private final ProfilService profilService;

    public ProfilController(ProfilService profilService) {
        this.profilService = profilService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Profil>> getAllProfils () {
        List<Profil> profils = profilService.findAllProfils();
        return new ResponseEntity<>(profils, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Profil> getProfilById (@PathVariable("id") Long id) {
        Profil profil = profilService.findProfilById(id);
        return new ResponseEntity<>(profil, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Profil> addProfil(@RequestBody Profil profil) {
        Profil newProfil = profilService.addProfil(profil);
        return new ResponseEntity<>(newProfil, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Profil> updateProfil(@RequestBody Profil profil) {
        Profil updateProfil = profilService.updateProfil(profil);
        return new ResponseEntity<>(updateProfil, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteProfil(@PathVariable("id") Long id) {
        profilService.deleteProfil(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
