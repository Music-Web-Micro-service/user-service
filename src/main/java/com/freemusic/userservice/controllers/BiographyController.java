package com.freemusic.userservice.controllers;

import com.freemusic.userservice.models.Biography;
import com.freemusic.userservice.services.BiographyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/biographies")
public class BiographyController {

    private final BiographyService biographyService;

    @Autowired
    public BiographyController(BiographyService biographyService) {
        this.biographyService = biographyService;
    }

    @GetMapping
    public ResponseEntity<List<Biography>> getAllBiographies() {
        List<Biography> biographies = biographyService.getAllBiographies();
        return new ResponseEntity<>(biographies, HttpStatus.OK);
    }

    @GetMapping("/{bioId}")
    public ResponseEntity<Biography> getBiographyById(@PathVariable int bioId) {
        return biographyService.getBiographyById(bioId)
                .map(biography -> new ResponseEntity<>(biography, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Biography> createBiography(@RequestBody Biography biography) {
        Biography savedBiography = biographyService.saveBiography(biography);
        return new ResponseEntity<>(savedBiography, HttpStatus.CREATED);
    }

    @DeleteMapping("/{bioId}")
    public ResponseEntity<Void> deleteBiography(@PathVariable int bioId) {
        biographyService.deleteBiography(bioId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @PutMapping("/{bioId}")
    public ResponseEntity<Biography> updateBiography(@PathVariable int bioId, @RequestBody Biography biography) {
        biography.setBioId(bioId);
        Biography updatedBiography = biographyService.updateBiography(biography);
        return new ResponseEntity<>(updatedBiography, HttpStatus.OK);
    }
}
