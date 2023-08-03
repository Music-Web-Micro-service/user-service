package com.freemusic.userservice.repositories;

import com.freemusic.userservice.models.Band;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2023/7/9
 */
@Repository
public interface BandRepository extends JpaRepository<Band, Integer> {
}