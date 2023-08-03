package com.freemusic.userservice.services;

import com.freemusic.userservice.models.Artist;

import java.util.List;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2023/7/8
 */
public interface ArtistService {
    Artist getArtistById(int artistId);

    List<Artist> getAllArtists();

    void addArtist(Artist artist);

    void deleteArtistById(int artistId);

    Artist updateArtist(Artist artist);

    /**
     * The way we get artist role if user is artist.
     *
     * @param userId userid
     * @return artist data.
     */
    Artist getArtistByUserId(int userId);

}
