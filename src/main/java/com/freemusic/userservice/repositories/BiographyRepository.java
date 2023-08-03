package com.freemusic.userservice.repositories;

import com.freemusic.userservice.models.Biography;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2023/7/8
 */
public interface BiographyRepository extends JpaRepository<Biography, Integer> {
}
