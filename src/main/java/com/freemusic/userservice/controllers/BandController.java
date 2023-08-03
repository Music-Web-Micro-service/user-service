package com.freemusic.userservice.controllers;

import com.freemusic.userservice.models.Band;
import com.freemusic.userservice.services.BandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bands")
public class BandController {

    private final BandService bandService;

    @Autowired
    public BandController(BandService bandService) {
        this.bandService = bandService;
    }

    @GetMapping
    public ResponseEntity<List<Band>> getAllBands() {
        List<Band> bands = bandService.getAllBands();
        return ResponseEntity.ok(bands);
    }

    @GetMapping("/{bandId}")
    public ResponseEntity<Band> getBandById(@PathVariable int bandId) {
        Band band = bandService.getBandById(bandId);
        return ResponseEntity.ok(band);
    }

    @PostMapping
    public ResponseEntity<Band> createBand(@RequestBody Band band) {
        Band createdBand = bandService.createBand(band);
        return new ResponseEntity<>(createdBand, HttpStatus.CREATED);
    }

    @PutMapping("/{bandId}")
    public ResponseEntity<Band> updateBand(@PathVariable int bandId, @RequestBody Band band) {
        Band updatedBand = bandService.updateBand(bandId, band);
        return ResponseEntity.ok(updatedBand);
    }

    @DeleteMapping("/{bandId}")
    public ResponseEntity<Void> deleteBand(@PathVariable int bandId) {
        bandService.deleteBand(bandId);
        return ResponseEntity.noContent().build();
    }
}
