package com.freemusic.userservice.services.implement;

import com.freemusic.userservice.models.Artist;
import com.freemusic.userservice.repositories.ArtistRepository;
import com.freemusic.userservice.services.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2023/7/8
 */
@Service
public class ArtistServiceImpl implements ArtistService {

    @Autowired
    ArtistRepository artistRepository;

    @Override
    public Artist getArtistById(int artistId) {
        return artistRepository.findById(artistId).orElse(null);
    }

    @Override
    public List<Artist> getAllArtists() {
        return artistRepository.findAll();
    }

    @Override
    public void addArtist(Artist artist) {
        artistRepository.save(artist);
    }

    @Override
    public void deleteArtistById(int artistId) {
        artistRepository.deleteById(artistId);
    }

    @Override
    public Artist updateArtist(Artist artist) {
        artistRepository.save(artist);
        return artist;
    }

    @Override
    public Artist getArtistByUserId(int userId) {
        return artistRepository.findArtistByUserId(userId);
    }
}
