package com.freemusic.userservice.controllers;

import com.freemusic.userservice.models.Artist;
import com.freemusic.userservice.services.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2023/7/8
 */
@RestController
@RequestMapping("/artists")
public class ArtistController {
    @Autowired
    private ArtistService artistService;

    @GetMapping
    public ResponseEntity<List<Artist>> getAllArtists() {
        List<Artist> artists = artistService.getAllArtists();
        return new ResponseEntity<>(artists, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Artist> getArtistById(@PathVariable Integer id) {
        Artist artist = artistService.getArtistById(id);
        if (artist != null) {
            return new ResponseEntity<>(artist, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Artist> createArtist(@RequestBody Artist artist) {
        artistService.addArtist(artist);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Artist> updateArtist(@PathVariable Integer id,@RequestBody Artist artist) {
        artist.setArtistId(id);
        Artist updatedArtist = artistService.updateArtist(artist);
        return new ResponseEntity<>(updatedArtist, HttpStatus.OK);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteArtist(@PathVariable Integer id) {
        artistService.deleteArtistById(id);
        Artist artist = artistService.getArtistById((id));
        if (artist == null) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<Artist> getArtistsByUserId(@PathVariable Integer userId) {
        Artist artists = artistService.getArtistByUserId(userId);
        if (artists != null) {
            return new ResponseEntity<>(artists, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
