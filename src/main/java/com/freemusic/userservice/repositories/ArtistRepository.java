package com.freemusic.userservice.repositories;

import com.freemusic.userservice.models.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2023/7/8
 */
public interface ArtistRepository extends JpaRepository<Artist, Integer> {
    public Artist findArtistByUserId(int userId);
}
